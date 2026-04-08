package androidx.compose.runtime.saveable;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/saveable/Saver;", "Original", "", "Saveable", "runtime-saveable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Saver<Original, Saveable> {
    /* JADX INFO: renamed from: a */
    Object mo3288a(Object obj);

    /* JADX INFO: renamed from: b */
    Object mo3289b(SaverScope saverScope, Object obj);
}
