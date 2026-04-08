package androidx.activity.compose;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "I", "O", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: a */
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 f135a = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UUID.randomUUID().toString();
    }
}
