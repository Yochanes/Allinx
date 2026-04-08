package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p013ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.p013ui.text.intl.Locale;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {

    /* JADX INFO: renamed from: a */
    public final View f8982a;

    /* JADX INFO: renamed from: b */
    public final InputMethodManagerImpl f8983b;

    /* JADX INFO: renamed from: f */
    public LegacyTextFieldState f8986f;

    /* JADX INFO: renamed from: g */
    public TextFieldSelectionManager f8987g;

    /* JADX INFO: renamed from: i */
    public ViewConfiguration f8988i;

    /* JADX INFO: renamed from: q */
    public Rect f8993q;

    /* JADX INFO: renamed from: r */
    public final LegacyCursorAnchorInfoController f8994r;

    /* JADX INFO: renamed from: c */
    public Lambda f8984c = LegacyTextInputMethodRequest$onEditCommand$1.f8997a;

    /* JADX INFO: renamed from: d */
    public Lambda f8985d = LegacyTextInputMethodRequest$onImeActionPerformed$1.f8998a;

    /* JADX INFO: renamed from: j */
    public TextFieldValue f8989j = new TextFieldValue("", TextRange.f20115b, 4);

    /* JADX INFO: renamed from: n */
    public ImeOptions f8990n = ImeOptions.f20367h;

    /* JADX INFO: renamed from: o */
    public final ArrayList f8991o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final Object f8992p = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, new LegacyTextInputMethodRequest$baseInputConnection$2(this));

    public LegacyTextInputMethodRequest(View view, Function1 function1, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f8982a = view;
        this.f8983b = inputMethodManagerImpl;
        this.f8994r = new LegacyCursorAnchorInfoController(function1, inputMethodManagerImpl);
    }

    @Override // androidx.compose.p013ui.platform.PlatformTextInputMethodRequest
    /* JADX INFO: renamed from: a */
    public final InputConnection mo3342a(EditorInfo editorInfo) {
        int i;
        int i2;
        TextFieldValue textFieldValue = this.f8989j;
        String str = textFieldValue.f20403a.f19890b;
        ImeOptions imeOptions = this.f8990n;
        long j = textFieldValue.f20404b;
        int i3 = imeOptions.f20372e;
        boolean z2 = imeOptions.f20368a;
        if (i3 == 1) {
            i = z2 ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i;
        LocaleList localeList = LocaleList.f20448c;
        LocaleList localeList2 = imeOptions.f20374g;
        if (Intrinsics.m18594b(localeList2, localeList)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(localeList2, 10));
            Iterator it = localeList2.f20449a.iterator();
            while (it.hasNext()) {
                arrayList.add(((Locale) it.next()).f20447a);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        int i4 = imeOptions.f20371d;
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z2 && (i2 & 1) == 1) {
            editorInfo.inputType = i2 | 131072;
            if (imeOptions.f20372e == 1) {
                editorInfo.imeOptions |= Ints.MAX_POWER_OF_TWO;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = imeOptions.f20369b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | UserMetadata.MAX_INTERNAL_KEY_SIZE;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (imeOptions.f20370c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = TextRange.f20116c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        EditorInfoCompat.m8110b(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!StylusHandwriting_androidKt.f8789a || i4 == 7 || i4 == 8) {
            EditorInfoCompat.m8111c(editorInfo, false);
        } else {
            EditorInfoCompat.m8111c(editorInfo, true);
            AbstractC0745d.m3428q(editorInfo, CollectionsKt.m18414O(AbstractC0745d.m3425n(), AbstractC0745d.m3437z(), AbstractC0745d.m3433v(), AbstractC0745d.m3435x(), AbstractC0745d.m3409B(), AbstractC0745d.m3410C(), AbstractC0745d.m3411D()));
            AbstractC0745d.m3429r(editorInfo, ArraysKt.m18372h0(new Class[]{AbstractC0745d.m3425n(), AbstractC0745d.m3437z(), AbstractC0745d.m3433v(), AbstractC0745d.m3435x()}));
        }
        Function1 function1 = LegacyPlatformTextInputServiceAdapter_androidKt.f8980a;
        if (EmojiCompat.m8785g()) {
            EmojiCompat.m8782a().m8793l(editorInfo);
        }
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.f8989j, new LegacyTextInputMethodRequest$createInputConnection$1(this), this.f8990n.f20370c, this.f8986f, this.f8987g, this.f8988i);
        this.f8991o.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }
}
