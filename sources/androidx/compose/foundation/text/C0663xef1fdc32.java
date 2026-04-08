package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0663xef1fdc32 extends Lambda implements Function1<KeyEvent, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyCommand keyCommandM3228a = KeyMapping_androidKt.f8478a.m3228a(((KeyEvent) obj).f18208a);
        return Boolean.valueOf(keyCommandM3228a == KeyCommand.f8469w || keyCommandM3228a == KeyCommand.f8471y);
    }
}
