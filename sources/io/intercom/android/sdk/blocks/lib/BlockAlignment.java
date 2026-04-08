package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BlockAlignment {
    public static final BlockAlignment LEFT = new C51521("LEFT", 0);
    public static final BlockAlignment CENTER = new C51532("CENTER", 1);
    public static final BlockAlignment RIGHT = new C51543("RIGHT", 2);
    private static final /* synthetic */ BlockAlignment[] $VALUES = $values();

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockAlignment$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51521 extends BlockAlignment {
        public C51521(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 8388611;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockAlignment$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51532 extends BlockAlignment {
        public C51532(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockAlignment$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51543 extends BlockAlignment {
        public C51543(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 8388613;
        }
    }

    private static /* synthetic */ BlockAlignment[] $values() {
        return new BlockAlignment[]{LEFT, CENTER, RIGHT};
    }

    private BlockAlignment(String str, int i) {
    }

    public static BlockAlignment alignValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return LEFT;
        }
    }

    public static BlockAlignment valueOf(String str) {
        return (BlockAlignment) Enum.valueOf(BlockAlignment.class, str);
    }

    public static BlockAlignment[] values() {
        return (BlockAlignment[]) $VALUES.clone();
    }

    public abstract int getGravity();

    public /* synthetic */ BlockAlignment(String str, int i, C51521 c51521) {
        this(str, i);
    }
}
