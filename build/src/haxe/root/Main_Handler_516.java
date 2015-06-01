package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main_Handler_516 implements org.vertx.java.core.Handler<org.vertx.java.core.http.HttpServerRequest>
{
	public Main_Handler_516()
	{
	}
	
	
	public void handle(org.vertx.java.core.http.HttpServerRequest request)
	{
		//line 19 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		//line 21 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		sb.append(haxe.lang.Runtime.toString(( ( "absolute uri : " + haxe.root.Std.string(request.absoluteURI()) ) + "\n" )));
		//line 23 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		{
			//line 23 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> __temp_iterator1 = request.headers().entries().iterator();
			//line 23 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			while (__temp_iterator1.hasNext())
			{
				//line 23 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> header = __temp_iterator1.next();
				//line 24 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
				sb.append(haxe.lang.Runtime.toString(( ( ( header.getKey() + ":" ) + header.getValue() ) + "\n" )));
			}
			
		}
		
		//line 27 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		sb.append(haxe.lang.Runtime.toString("----------------------------------------------\n"));
		//line 29 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		{
			//line 29 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> __temp_iterator2 = request.params().entries().iterator();
			//line 29 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			while (__temp_iterator2.hasNext())
			{
				//line 29 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> param = __temp_iterator2.next();
				//line 30 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
				sb.append(haxe.lang.Runtime.toString(( ( ( param.getKey() + ":" ) + param.getValue() ) + "\n" )));
			}
			
		}
		
		//line 34 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		request.response().putHeader(haxe.lang.Runtime.toString("content-type"), haxe.lang.Runtime.toString("text/plain"));
		//line 35 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		request.response().end(haxe.lang.Runtime.toString(sb.toString()));
	}
	
	
}


