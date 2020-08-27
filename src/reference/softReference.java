package reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class softReference {

    SoftReference<String> softReference = new SoftReference<>("abc");

    WeakReference<String> weakReference = new WeakReference<>("def");
}
