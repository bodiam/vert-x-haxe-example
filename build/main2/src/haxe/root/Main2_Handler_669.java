package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main2_Handler_669 implements org.vertx.java.core.Handler<org.vertx.java.core.http.HttpServerRequest>
{
	public Main2_Handler_669()
	{
	}
	
	
	public void handle(org.vertx.java.core.http.HttpServerRequest request)
	{
		//line 34 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		java.lang.String path = request.path();
		//line 35 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		haxe.ds.StringMap<java.lang.String> params = new haxe.ds.StringMap<java.lang.String>();
		//line 37 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		{
			//line 37 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> __temp_iterator1 = request.params().entries().iterator();
			//line 37 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
			while (__temp_iterator1.hasNext())
			{
				//line 37 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> param = __temp_iterator1.next();
				//line 38 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
				params.set(param.getKey(), param.getValue());
			}
			
		}
		
		//line 41 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		haxe.root.Router router = new haxe.root.Router();
		//line 42 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		new haxe.web.Dispatch(path, ((haxe.ds.StringMap<java.lang.String>) (params) )).runtimeDispatch(haxe.web.Dispatch.extractConfig(router));
		//line 44 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		request.response().putHeader(haxe.lang.Runtime.toString("content-type"), haxe.lang.Runtime.toString("text/plain"));
		//line 45 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main2.hx"
		request.response().end(haxe.lang.Runtime.toString(router.output));
	}
	
	
}


