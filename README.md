netty-jssc
==========

[![Apache 2.0](https://img.shields.io/github/license/jkschneider/netty-jssc.svg)](http://www.apache.org/licenses/LICENSE-2.0)

Use Java Simple Serial Connector (JSSC) as an I/O source to a Netty channel

## Maven

	<dependency>
		<groupId>com.github.jkschneider</groupId>
		<artifactId>netty-jssc</artifactId>
		<version>0.1.0</version>
	</dependency>

## Example: Delimit frames by line ending and print results to `System.out`

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
	
## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
