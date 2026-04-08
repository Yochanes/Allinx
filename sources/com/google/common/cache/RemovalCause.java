package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public abstract class RemovalCause {
    public static final RemovalCause EXPLICIT = new C41521("EXPLICIT", 0);
    public static final RemovalCause REPLACED = new C41532("REPLACED", 1);
    public static final RemovalCause COLLECTED = new C41543("COLLECTED", 2);
    public static final RemovalCause EXPIRED = new C41554("EXPIRED", 3);
    public static final RemovalCause SIZE = new C41565("SIZE", 4);
    private static final /* synthetic */ RemovalCause[] $VALUES = $values();

    /* JADX INFO: renamed from: com.google.common.cache.RemovalCause$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C41521 extends RemovalCause {
        public C41521(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.RemovalCause$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C41532 extends RemovalCause {
        public C41532(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.RemovalCause$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C41543 extends RemovalCause {
        public C41543(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.RemovalCause$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C41554 extends RemovalCause {
        public C41554(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.RemovalCause$5 */
    /* JADX INFO: compiled from: Proguard */
    public enum C41565 extends RemovalCause {
        public C41565(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    }

    private static /* synthetic */ RemovalCause[] $values() {
        return new RemovalCause[]{EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE};
    }

    private RemovalCause(String str, int i) {
    }

    public static RemovalCause valueOf(String str) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, str);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) $VALUES.clone();
    }

    public abstract boolean wasEvicted();

    public /* synthetic */ RemovalCause(String str, int i, C41521 c41521) {
        this(str, i);
    }
}
