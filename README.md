# vert-x-haxe-example
Example for intergrate vert.x with haxe and java target

haxe dependency hxAnonCls
```
  haxelib git hxAnonCls https://github.com/andyli/hxAnonCls
```

Code for example. Run vert.x as as standalone embeeded.

```
import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.VertxFactory;
import org.vertx.java.core.http.HttpServerRequest;
import java.lang.StringBuilder;

@:build(hxAnonCls.Macros.build()) @:throws("Exception") class Main {
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

for compile and run the example 
```
 haxe build.hxml
 java -jar build/Main.jar
```

testing open the browser to http://127.0.0.1:1234 and see the output

