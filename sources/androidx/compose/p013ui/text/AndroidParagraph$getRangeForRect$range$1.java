package androidx.compose.p013ui.text;

import android.graphics.RectF;
import androidx.compose.p013ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "segmentBounds", "Landroid/graphics/RectF;", "area", "invoke", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidParagraph$getRangeForRect$range$1 extends Lambda implements Function2<RectF, RectF, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextInclusionStrategy f19888a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$getRangeForRect$range$1(TextInclusionStrategy textInclusionStrategy) {
        super(2);
        this.f19888a = textInclusionStrategy;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(this.f19888a.mo38b(RectHelper_androidKt.m5246e((RectF) obj), RectHelper_androidKt.m5246e((RectF) obj2)));
    }
}
