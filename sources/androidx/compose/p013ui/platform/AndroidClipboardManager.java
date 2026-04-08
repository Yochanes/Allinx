package androidx.compose.p013ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidClipboardManager implements ClipboardManager {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f19040a;

    public AndroidClipboardManager(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f19040a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    @Override // androidx.compose.p013ui.platform.ClipboardManager
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5995a(AnnotatedString annotatedString) {
        List list = annotatedString.f19891c;
        List list2 = EmptyList.f51496a;
        if (list == null) {
            list = list2;
        }
        boolean zIsEmpty = list.isEmpty();
        CharSequence charSequence = annotatedString.f19890b;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            EncodeHelper encodeHelper = new EncodeHelper();
            encodeHelper.f19409a = Parcel.obtain();
            ArrayList arrayList = annotatedString.f19891c;
            if (arrayList != null) {
                list2 = arrayList;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list2.get(i);
                SpanStyle spanStyle = (SpanStyle) range.f19900a;
                encodeHelper.f19409a.recycle();
                encodeHelper.f19409a = Parcel.obtain();
                long f20516a = spanStyle.f20064a.getF20516a();
                long j = Color.f17583k;
                if (!Color.m5181c(f20516a, j)) {
                    encodeHelper.m6142a((byte) 1);
                    encodeHelper.f19409a.writeLong(spanStyle.f20064a.getF20516a());
                }
                long j2 = TextUnit.f20575c;
                long j3 = spanStyle.fontSize;
                if (!TextUnit.m6673a(j3, j2)) {
                    encodeHelper.m6142a((byte) 2);
                    encodeHelper.m6144c(j3);
                }
                FontWeight fontWeight = spanStyle.fontWeight;
                if (fontWeight != null) {
                    encodeHelper.m6142a((byte) 3);
                    encodeHelper.f19409a.writeInt(fontWeight.f20303a);
                }
                FontStyle fontStyle = spanStyle.fontStyle;
                if (fontStyle != null) {
                    encodeHelper.m6142a((byte) 4);
                    int i2 = fontStyle.f20290a;
                    encodeHelper.m6142a((i2 != 0 && i2 == 1) ? (byte) 1 : (byte) 0);
                }
                FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
                if (fontSynthesis != null) {
                    encodeHelper.m6142a((byte) 5);
                    int i3 = fontSynthesis.f20291a;
                    if (i3 != 0) {
                        byte b2 = i3 != 65535 ? i3 == 1 ? (byte) 2 : i3 == 2 ? (byte) 3 : (byte) 0 : (byte) 1;
                        encodeHelper.m6142a(b2);
                    }
                }
                String str = spanStyle.fontFeatureSettings;
                if (str != null) {
                    encodeHelper.m6142a((byte) 6);
                    encodeHelper.f19409a.writeString(str);
                }
                long j4 = spanStyle.letterSpacing;
                if (!TextUnit.m6673a(j4, j2)) {
                    encodeHelper.m6142a((byte) 7);
                    encodeHelper.m6144c(j4);
                }
                BaselineShift baselineShift = spanStyle.baselineShift;
                if (baselineShift != null) {
                    encodeHelper.m6142a((byte) 8);
                    encodeHelper.m6143b(baselineShift.f20513a);
                }
                TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
                if (textGeometricTransform != null) {
                    encodeHelper.m6142a((byte) 9);
                    encodeHelper.m6143b(textGeometricTransform.f20542a);
                    encodeHelper.m6143b(textGeometricTransform.f20543b);
                }
                long j5 = spanStyle.f20075l;
                if (!Color.m5181c(j5, j)) {
                    encodeHelper.m6142a((byte) 10);
                    encodeHelper.f19409a.writeLong(j5);
                }
                TextDecoration textDecoration = spanStyle.background;
                if (textDecoration != null) {
                    encodeHelper.m6142a(Ascii.f42547VT);
                    encodeHelper.f19409a.writeInt(textDecoration.f20536a);
                }
                Shadow shadow = spanStyle.shadow;
                if (shadow != null) {
                    encodeHelper.m6142a(Ascii.f42536FF);
                    encodeHelper.f19409a.writeLong(shadow.f17657a);
                    long j6 = shadow.f17658b;
                    encodeHelper.m6143b(Float.intBitsToFloat((int) (j6 >> 32)));
                    encodeHelper.m6143b(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    encodeHelper.m6143b(shadow.f17659c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(encodeHelper.f19409a.marshall(), 0)), range.f19901b, range.f19902c, 33);
            }
            charSequence = spannableString;
        }
        this.f19040a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
