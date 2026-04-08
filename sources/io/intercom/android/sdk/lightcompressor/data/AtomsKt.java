package io.intercom.android.sdk.lightcompressor.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u001c\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0014\u0010\u0011\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0014\u0010\u0015\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0014\u0010\u0017\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0014\u0010\u0019\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0014\u0010\u001b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0014\u0010\u001d\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006¨\u0006\u001f"}, m18302d2 = {"fourCcToInt", "", "byteArray", "", "FREE_ATOM", "getFREE_ATOM", "()I", "JUNK_ATOM", "getJUNK_ATOM", "MDAT_ATOM", "getMDAT_ATOM", "MOOV_ATOM", "getMOOV_ATOM", "PNOT_ATOM", "getPNOT_ATOM", "SKIP_ATOM", "getSKIP_ATOM", "WIDE_ATOM", "getWIDE_ATOM", "PICT_ATOM", "getPICT_ATOM", "FTYP_ATOM", "getFTYP_ATOM", "UUID_ATOM", "getUUID_ATOM", "CMOV_ATOM", "getCMOV_ATOM", "STCO_ATOM", "getSTCO_ATOM", "CO64_ATOM", "getCO64_ATOM", "intercom-sdk-lightcompressor_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AtomsKt {
    private static final int FREE_ATOM = fourCcToInt(new byte[]{102, 114, 101, 101});
    private static final int JUNK_ATOM = fourCcToInt(new byte[]{106, 117, 110, 107});
    private static final int MDAT_ATOM = fourCcToInt(new byte[]{109, 100, 97, 116});
    private static final int MOOV_ATOM = fourCcToInt(new byte[]{109, 111, 111, 118});
    private static final int PNOT_ATOM = fourCcToInt(new byte[]{112, 110, 111, 116});
    private static final int SKIP_ATOM = fourCcToInt(new byte[]{115, 107, 105, 112});
    private static final int WIDE_ATOM = fourCcToInt(new byte[]{119, 105, 100, 101});
    private static final int PICT_ATOM = fourCcToInt(new byte[]{80, 73, 67, 84});
    private static final int FTYP_ATOM = fourCcToInt(new byte[]{102, 116, 121, 112});
    private static final int UUID_ATOM = fourCcToInt(new byte[]{117, 117, 105, 100});
    private static final int CMOV_ATOM = fourCcToInt(new byte[]{99, 109, 111, 118});
    private static final int STCO_ATOM = fourCcToInt(new byte[]{115, 116, 99, 111});
    private static final int CO64_ATOM = fourCcToInt(new byte[]{99, 111, 54, 52});

    public static final int fourCcToInt(@NotNull byte[] byteArray) {
        Intrinsics.m18599g(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static final int getCMOV_ATOM() {
        return CMOV_ATOM;
    }

    public static final int getCO64_ATOM() {
        return CO64_ATOM;
    }

    public static final int getFREE_ATOM() {
        return FREE_ATOM;
    }

    public static final int getFTYP_ATOM() {
        return FTYP_ATOM;
    }

    public static final int getJUNK_ATOM() {
        return JUNK_ATOM;
    }

    public static final int getMDAT_ATOM() {
        return MDAT_ATOM;
    }

    public static final int getMOOV_ATOM() {
        return MOOV_ATOM;
    }

    public static final int getPICT_ATOM() {
        return PICT_ATOM;
    }

    public static final int getPNOT_ATOM() {
        return PNOT_ATOM;
    }

    public static final int getSKIP_ATOM() {
        return SKIP_ATOM;
    }

    public static final int getSTCO_ATOM() {
        return STCO_ATOM;
    }

    public static final int getUUID_ATOM() {
        return UUID_ATOM;
    }

    public static final int getWIDE_ATOM() {
        return WIDE_ATOM;
    }
}
