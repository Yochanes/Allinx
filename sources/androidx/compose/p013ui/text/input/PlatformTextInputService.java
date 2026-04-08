package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputService;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PlatformTextInputService {
    /* JADX INFO: renamed from: b */
    void mo3339b();

    /* JADX INFO: renamed from: c */
    void mo3293c();

    /* JADX INFO: renamed from: d */
    void mo3340d();

    /* JADX INFO: renamed from: e */
    void mo3294e(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    /* JADX INFO: renamed from: f */
    void mo3295f(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12);

    /* JADX INFO: renamed from: a */
    default void mo3292a() {
    }

    /* JADX INFO: renamed from: h */
    default void mo3297h(Rect rect) {
    }

    /* JADX INFO: renamed from: g */
    default void mo3296g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
    }
}
