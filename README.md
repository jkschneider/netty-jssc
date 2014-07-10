netty-jssc
==========

Use Java Simple Serial Connector (JSSC) as an I/O source to a Netty channel

### Maven

	<dependency>
		<groupId>com.github.jkschneider</groupId>
		<artifactId>netty-jssc</artifactId>
		<version>0.1.0</version>
	</dependency>

### Example: Delimit frames by line ending and print results to `System.out`

Using Java 8:

	public class SimpleLineBasedSerialChannelTest {
	    public static void main(String[] args) {
	        SimpleLineBasedSerialChannel channel = new SimpleLineBasedSerialChannel("/dev/ttyACM0",
	                (ctx, msg) -> System.out.println(msg));
	    }
	}

Using Java 7:

	public class SimpleLineBasedSerialChannelTest {
	    public static void main(String[] args) {
	        SimpleLineBasedSerialChannel channel = new SimpleLineBasedSerialChannel("/dev/ttyACM0",
	            new SimpleStringChannelHandler() {
	                @Override
	                public void channelRead(ChannelHandlerContext ctx, String msg) throws Exception {
	                    System.out.println(msg);
	                }
	            });
	    }
	}
