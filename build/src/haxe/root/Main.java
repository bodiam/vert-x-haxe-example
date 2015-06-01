package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public Main(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main()
	{
		//line 9 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	public static void __hx_ctor__Main(haxe.root.Main __temp_me3)
	{
	}
	
	
	public static void main()
	{
		//line 11 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		try 
		{
			//line 13 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			org.vertx.java.core.Vertx vertx = org.vertx.java.core.VertxFactory.newVertx();
			//line 14 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			org.vertx.java.core.http.HttpServer server = vertx.createHttpServer();
			//line 16 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			server.requestHandler(((org.vertx.java.core.Handler<org.vertx.java.core.http.HttpServerRequest>) (new haxe.root.Main_Handler_516()) ));
			//line 39 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			server.listen(((int) (1234) ));
			//line 40 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			System.in.read();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 11 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 42 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 42 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 42 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 42 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
			{
				//line 42 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
				java.lang.Object e = __temp_catchall2;
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		return new haxe.root.Main(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "/home/francesco/Downloads/vert.x-2.1.5/Main.hx"
		return new haxe.root.Main();
	}
	
	
}


