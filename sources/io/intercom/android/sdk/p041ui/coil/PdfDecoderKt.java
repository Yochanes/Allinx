package io.intercom.android.sdk.p041ui.coil;

import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082\b\u001a#\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082\b\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\n"}, m18302d2 = {"widthPx", "", "Lcoil/size/Size;", "scale", "Lcoil/size/Scale;", "original", "Lkotlin/Function0;", "heightPx", "toPx", "Lcoil/size/Dimension;", "intercom-sdk-ui_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PdfDecoderKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                Scale scale = Scale.f33951a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Scale scale2 = Scale.f33951a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ int access$toPx(Dimension dimension, Scale scale) {
        return toPx(dimension, scale);
    }

    private static final int heightPx(Size size, Scale scale, Function0<Integer> function0) {
        return Intrinsics.m18594b(size, Size.f33955c) ? ((Number) function0.invoke()).intValue() : access$toPx(size.f33957b, scale);
    }

    private static final int toPx(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f33941a;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int widthPx(Size size, Scale scale, Function0<Integer> function0) {
        return Intrinsics.m18594b(size, Size.f33955c) ? ((Number) function0.invoke()).intValue() : access$toPx(size.f33956a, scale);
    }
}
