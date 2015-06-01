# vert-x-haxe-example
Examples for intergrate vert.x with haxe and java target and with haxe Web Dispatcher

haxe dependency hxAnonCls
```
  haxelib git hxAnonCls https://github.com/andyli/hxAnonCls
```

Code for example. Run vert.x as as standalone embeeded.

Example 1 Base

```
import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.VertxFactory;
import org.vertx.java.core.http.HttpServerRequest;
import java.lang.StringBuilder;

@:build(hxAnonCls.Macros.build()) @:throws("Exception") class Main1 {
  public static function main() {
    try {

      var vertx = VertxFactory.newVertx();
      var server = vertx.createHttpServer();

      server.requestHandler((new Handler<HttpServerRequest>():{
        public function handle(request:HttpServerRequest ) {

          var sb = new StringBuilder();

          sb.append("absolute uri : " + request.absoluteURI() + "\n");

          for (header in request.headers().entries()) {
            sb.append(header.getKey() + ":" + header.getValue() + "\n");
          }

          sb.append("----------------------------------------------\n");

          for (param in request.params().entries()) {
            sb.append(param.getKey() + ":" + param.getValue() + "\n");
          }


          request.response().putHeader("content-type", "text/plain");
          request.response().end(sb.toString());
        }
      }));

      server.listen(1234);
      untyped __java__("System.in.read()");

    } catch(e:Dynamic) {};

  }
}
```

Example2 with haxe Web Dispatcher

```
import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.VertxFactory;
import org.vertx.java.core.http.HttpServerRequest;
import haxe.web.Dispatch;


class Router {

  public var output:String = "";

  public function new() {}

  public function doHello(name:String) {
    output = 'hello $name';
  }


}


@:build(hxAnonCls.Macros.build()) @:throws("Exception") class Main2 {
  public static function main() {
    try {

      var vertx = VertxFactory.newVertx();
      var server = vertx.createHttpServer();

      server.requestHandler((new Handler<HttpServerRequest>():{
        public function handle(request:HttpServerRequest ) {

          var path = request.path();
          var params =  new haxe.ds.StringMap();

          for (param in request.params().entries()) {
            params.set(param.getKey(),param.getValue());
          }

          var router = new Router();
          Dispatch.run(path,params,router);

          request.response().putHeader("content-type", "text/plain");
          request.response().end(router.output);

        }
      }));

      server.listen(1234);
      untyped __java__("System.in.read()");

    } catch(e:Dynamic) {};

  }
}
```

for compile and run the example1 and example2
```
 haxe build.hxml
 java -jar build/main1/Main1.jar
 java -jar build/main2/Main2.jar
```

testing open the browser to http://127.0.0.1:1234 and see the output

for example2 try http://127.0.0.1:1234/hello/gino
