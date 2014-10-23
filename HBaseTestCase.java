import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;


public class HBaseTestCase {
	
	static Configuration cfg = null;
	static {
		cfg = HBaseConfiguration.create();
		cfg.set("hbase.zookeeper.quorum", "10.146.16.9");
		cfg.set("hbase.zookeeper.property.clientPort", "2181");
		/*cfg.set("hbase.zookeeper.property.clientPort", "9000");*/
	}
	
	public static void main(String[] args) {
		String tablename = "test";
		HBaseTestCase.getAllData(tablename);
	}
	
	public static void getAllData(String tablename) {
		try {
			HTable table = new HTable(cfg, "test");
			Scan s = new Scan();
			ResultScanner rs = table.getScanner(s);
			for(Result r:rs)
			{
				for(KeyValue kv:r.raw()){
					System.out.println(new String(kv.getRow()));
					System.out.println(new String(kv.getValue()));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
