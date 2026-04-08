package androidx.emoji2.text;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class EmojiExclusions {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class EmojiExclusions_Api34 {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Set<int[]> m8797a() {
            return EmojiExclusions_Reflections.m8798a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EmojiExclusions_Reflections {
        /* JADX INFO: renamed from: a */
        public static Set m8798a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }
}
