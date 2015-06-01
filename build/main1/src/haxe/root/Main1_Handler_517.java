package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main1_Handler_517 implements org.vertx.java.core.Handler<org.vertx.java.core.http.HttpServerRequest>
{
	public Main1_Handler_517()
	{
	}
	
	
	public void handle(org.vertx.java.core.http.HttpServerRequest request)
	{
		//line 19 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		//line 21 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		sb.append(haxe.lang.Runtime.toString(( ( "absolute uri : " + haxe.root.Std.string(request.absoluteURI()) ) + "\n" )));
		//line 23 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		{
			//line 23 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> __temp_iterator1 = request.headers().entries().iterator();
			//line 23 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			while (__temp_iterator1.hasNext())
			{
				//line 23 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> header = __temp_iterator1.next();
				//line 24 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
				sb.append(haxe.lang.Runtime.toString(( ( ( header.getKey() + ":" ) + header.getValue() ) + "\n" )));
			}
			
		}
		
		//line 27 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		sb.append(haxe.lang.Runtime.toString("----------------------------------------------\n"));
		//line 29 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		{
			//line 29 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> __temp_iterator2 = request.params().entries().iterator();
			//line 29 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
			while (__temp_iterator2.hasNext())
			{
				//line 29 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> param = __temp_iterator2.next();
				//line 30 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
				sb.append(haxe.lang.Runtime.toString(( ( ( param.getKey() + ":" ) + param.getValue() ) + "\n" )));
			}
			
		}
		
		//line 34 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		request.response().putHeader(haxe.lang.Runtime.toString("content-type"), haxe.lang.Runtime.toString("text/plain"));
		//line 35 "/home/VEESPO/fagati/code/fagati/git/tmp/dddd/vert-x-haxe-example/Main1.hx"
		request.response().end(haxe.lang.Runtime.toString(sb.toString()));
	}
	
	
}


