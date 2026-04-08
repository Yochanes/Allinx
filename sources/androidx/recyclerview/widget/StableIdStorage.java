package androidx.recyclerview.widget;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface StableIdStorage {

    /* JADX INFO: compiled from: Proguard */
    public static class IsolatedStableIdStorage implements StableIdStorage {

        /* JADX INFO: compiled from: Proguard */
        public class WrapperStableIdLookup implements StableIdLookup {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class NoStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C21541 implements StableIdLookup {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C21551 implements StableIdLookup {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface StableIdLookup {
    }
}
