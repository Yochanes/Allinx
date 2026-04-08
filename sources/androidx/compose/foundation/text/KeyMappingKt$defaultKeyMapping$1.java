package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.key.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public /* synthetic */ class KeyMappingKt$defaultKeyMapping$1 extends PropertyReference1Impl {

    /* JADX INFO: renamed from: a */
    public static final KeyMappingKt$defaultKeyMapping$1 f8476a = new KeyMappingKt$defaultKeyMapping$1(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((KeyEvent) obj).f18208a.isCtrlPressed());
    }
}
