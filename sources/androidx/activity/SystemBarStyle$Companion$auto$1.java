package androidx.activity;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "resources", "Landroid/content/res/Resources;", "invoke", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class SystemBarStyle$Companion$auto$1 extends Lambda implements Function1<Resources, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final SystemBarStyle$Companion$auto$1 f120a = new SystemBarStyle$Companion$auto$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        Intrinsics.m18599g(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
