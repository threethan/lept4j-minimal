package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * Hash item, containing storage for the key, value and count.  The key<br>
 * is a l_uint64, which is hashed by the mod function to find the index<br>
 * into the hashtab.<br>
 * <i>native declaration : hashmap.h:19</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Hashitem extends Structure {
	/**
	 * key is hashed into index into hashtab<br>
	 * C type : l_uint64
	 */
	public long key;
	/**
	 * number stored associated with the key<br>
	 * C type : l_uint64
	 */
	public long val;
	/**
	 * number of elements seen with this key<br>
	 * C type : l_int32
	 */
	public int count;
	/**
	 * ptr to the next in the list<br>
	 * C type : L_Hashitem*
	 */
	public L_Hashitem.ByReference next;
	public L_Hashitem() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("key", "val", "count", "next");
	}
	/**
	 * @param key key is hashed into index into hashtab<br>
	 * C type : l_uint64<br>
	 * @param val number stored associated with the key<br>
	 * C type : l_uint64<br>
	 * @param count number of elements seen with this key<br>
	 * C type : l_int32<br>
	 * @param next ptr to the next in the list<br>
	 * C type : L_Hashitem*
	 */
	public L_Hashitem(long key, long val, int count, L_Hashitem.ByReference next) {
		super();
		this.key = key;
		this.val = val;
		this.count = count;
		this.next = next;
	}
	public L_Hashitem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends L_Hashitem implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Hashitem implements Structure.ByValue {
		
	};
}