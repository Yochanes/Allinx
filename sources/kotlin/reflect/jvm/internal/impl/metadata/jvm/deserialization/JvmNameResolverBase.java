package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public class JvmNameResolverBase implements NameResolver {

    /* JADX INFO: renamed from: d */
    public static final List f54017d;

    /* JADX INFO: renamed from: a */
    public final String[] f54018a;

    /* JADX INFO: renamed from: b */
    public final Set f54019b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f54020c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        String strM18409J = CollectionsKt.m18409J(CollectionsKt.m18414O('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listM18414O = CollectionsKt.m18414O(AbstractC0000a.m2C(strM18409J, "/Any"), AbstractC0000a.m2C(strM18409J, "/Nothing"), AbstractC0000a.m2C(strM18409J, "/Unit"), AbstractC0000a.m2C(strM18409J, "/Throwable"), AbstractC0000a.m2C(strM18409J, "/Number"), AbstractC0000a.m2C(strM18409J, "/Byte"), AbstractC0000a.m2C(strM18409J, "/Double"), AbstractC0000a.m2C(strM18409J, "/Float"), AbstractC0000a.m2C(strM18409J, "/Int"), AbstractC0000a.m2C(strM18409J, "/Long"), AbstractC0000a.m2C(strM18409J, "/Short"), AbstractC0000a.m2C(strM18409J, "/Boolean"), AbstractC0000a.m2C(strM18409J, "/Char"), AbstractC0000a.m2C(strM18409J, "/CharSequence"), AbstractC0000a.m2C(strM18409J, "/String"), AbstractC0000a.m2C(strM18409J, "/Comparable"), AbstractC0000a.m2C(strM18409J, "/Enum"), AbstractC0000a.m2C(strM18409J, "/Array"), AbstractC0000a.m2C(strM18409J, "/ByteArray"), AbstractC0000a.m2C(strM18409J, "/DoubleArray"), AbstractC0000a.m2C(strM18409J, "/FloatArray"), AbstractC0000a.m2C(strM18409J, "/IntArray"), AbstractC0000a.m2C(strM18409J, "/LongArray"), AbstractC0000a.m2C(strM18409J, "/ShortArray"), AbstractC0000a.m2C(strM18409J, "/BooleanArray"), AbstractC0000a.m2C(strM18409J, "/CharArray"), AbstractC0000a.m2C(strM18409J, "/Cloneable"), AbstractC0000a.m2C(strM18409J, "/Annotation"), AbstractC0000a.m2C(strM18409J, "/collections/Iterable"), AbstractC0000a.m2C(strM18409J, "/collections/MutableIterable"), AbstractC0000a.m2C(strM18409J, "/collections/Collection"), AbstractC0000a.m2C(strM18409J, "/collections/MutableCollection"), AbstractC0000a.m2C(strM18409J, "/collections/List"), AbstractC0000a.m2C(strM18409J, "/collections/MutableList"), AbstractC0000a.m2C(strM18409J, "/collections/Set"), AbstractC0000a.m2C(strM18409J, "/collections/MutableSet"), AbstractC0000a.m2C(strM18409J, "/collections/Map"), AbstractC0000a.m2C(strM18409J, "/collections/MutableMap"), AbstractC0000a.m2C(strM18409J, "/collections/Map.Entry"), AbstractC0000a.m2C(strM18409J, "/collections/MutableMap.MutableEntry"), AbstractC0000a.m2C(strM18409J, "/collections/Iterator"), AbstractC0000a.m2C(strM18409J, "/collections/MutableIterator"), AbstractC0000a.m2C(strM18409J, "/collections/ListIterator"), AbstractC0000a.m2C(strM18409J, "/collections/MutableListIterator"));
        f54017d = listM18414O;
        IndexingIterable indexingIterableM18401C0 = CollectionsKt.m18401C0(listM18414O);
        int iM18484g = MapsKt.m18484g(CollectionsKt.m18452r(indexingIterableM18401C0, 10));
        if (iM18484g < 16) {
            iM18484g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g);
        Iterator it = indexingIterableM18401C0.iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.f51502a.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            linkedHashMap.put((String) indexedValue.f51500b, Integer.valueOf(indexedValue.f51499a));
        }
    }

    public JvmNameResolverBase(String[] strings, Set set, ArrayList arrayList) {
        Intrinsics.m18599g(strings, "strings");
        this.f54018a = strings;
        this.f54019b = set;
        this.f54020c = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /* JADX INFO: renamed from: a */
    public final String mo19532a(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /* JADX INFO: renamed from: b */
    public final boolean mo19533b(int i) {
        return this.f54019b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getString(int i) {
        String string;
        JvmProtoBuf.StringTableTypes.Record record = (JvmProtoBuf.StringTableTypes.Record) this.f54020c.get(i);
        int i2 = record.f53984b;
        if ((i2 & 4) == 4) {
            Object obj = record.f53987f;
            if (obj instanceof String) {
                string = (String) obj;
            } else {
                ByteString byteString = (ByteString) obj;
                String strM19634q = byteString.m19634q();
                if (byteString.mo19629j()) {
                    record.f53987f = strM19634q;
                }
                string = strM19634q;
            }
        } else if ((i2 & 2) == 2) {
            List list = f54017d;
            int size = list.size();
            int i3 = record.f53986d;
            string = (i3 < 0 || i3 >= size) ? this.f54018a[i] : (String) list.get(i3);
        }
        if (record.f53989i.size() >= 2) {
            List substringIndexList = record.f53989i;
            Intrinsics.m18598f(substringIndexList, "substringIndexList");
            Integer begin = (Integer) substringIndexList.get(0);
            Integer end = (Integer) substringIndexList.get(1);
            Intrinsics.m18598f(begin, "begin");
            if (begin.intValue() >= 0) {
                int iIntValue = begin.intValue();
                Intrinsics.m18598f(end, "end");
                if (iIntValue <= end.intValue() && end.intValue() <= string.length()) {
                    string = string.substring(begin.intValue(), end.intValue());
                    Intrinsics.m18598f(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.f53991n.size() >= 2) {
            List replaceCharList = record.f53991n;
            Intrinsics.m18598f(replaceCharList, "replaceCharList");
            Integer num = (Integer) replaceCharList.get(0);
            Integer num2 = (Integer) replaceCharList.get(1);
            Intrinsics.m18598f(string, "string");
            string = StringsKt.m20410H(string, (char) num.intValue(), (char) num2.intValue());
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.f53988g;
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int iOrdinal = operation.ordinal();
        if (iOrdinal == 1) {
            Intrinsics.m18598f(string, "string");
            string = StringsKt.m20410H(string, '$', '.');
        } else if (iOrdinal == 2) {
            if (string.length() >= 2) {
                string = string.substring(1, string.length() - 1);
                Intrinsics.m18598f(string, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            string = StringsKt.m20410H(string, '$', '.');
        }
        Intrinsics.m18598f(string, "string");
        return string;
    }
}
