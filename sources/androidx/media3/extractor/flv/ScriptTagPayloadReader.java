package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public long f28411b;

    /* JADX INFO: renamed from: c */
    public long[] f28412c;

    /* JADX INFO: renamed from: d */
    public long[] f28413d;

    /* JADX INFO: renamed from: a */
    public static Serializable m10838a(int i, ParsableByteArray parsableByteArray) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.m9562o()));
        }
        if (i == 1) {
            return Boolean.valueOf(parsableByteArray.m9568u() == 1);
        }
        if (i == 2) {
            return m10840c(parsableByteArray);
        }
        if (i != 3) {
            if (i == 8) {
                return m10839b(parsableByteArray);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(parsableByteArray.m9562o()));
                parsableByteArray.m9547H(2);
                return date;
            }
            int iM9572y = parsableByteArray.m9572y();
            ArrayList arrayList = new ArrayList(iM9572y);
            for (int i2 = 0; i2 < iM9572y; i2++) {
                Serializable serializableM10838a = m10838a(parsableByteArray.m9568u(), parsableByteArray);
                if (serializableM10838a != null) {
                    arrayList.add(serializableM10838a);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM10840c = m10840c(parsableByteArray);
            int iM9568u = parsableByteArray.m9568u();
            if (iM9568u == 9) {
                return map;
            }
            Serializable serializableM10838a2 = m10838a(iM9568u, parsableByteArray);
            if (serializableM10838a2 != null) {
                map.put(strM10840c, serializableM10838a2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m10839b(ParsableByteArray parsableByteArray) {
        int iM9572y = parsableByteArray.m9572y();
        HashMap map = new HashMap(iM9572y);
        for (int i = 0; i < iM9572y; i++) {
            String strM10840c = m10840c(parsableByteArray);
            Serializable serializableM10838a = m10838a(parsableByteArray.m9568u(), parsableByteArray);
            if (serializableM10838a != null) {
                map.put(strM10840c, serializableM10838a);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static String m10840c(ParsableByteArray parsableByteArray) {
        int iM9540A = parsableByteArray.m9540A();
        int i = parsableByteArray.f25645b;
        parsableByteArray.m9547H(iM9540A);
        return new String(parsableByteArray.f25644a, i, iM9540A);
    }
}
