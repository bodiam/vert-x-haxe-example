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
