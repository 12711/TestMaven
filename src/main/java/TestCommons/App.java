package TestCommons;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> a1=new ArrayList<String>();
        a1.add("123");
        List<String> b1=new ArrayList<String>();
        b1.add("456");
        List<String> c1=new ArrayList<String>();
        c1=new ArrayList<String>(CollectionUtils.union(a1,b1));
        System.out.println( c1 );

        CollectionUtils.isEmpty(a1);
    }
}
