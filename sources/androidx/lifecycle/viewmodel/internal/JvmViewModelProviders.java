package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/internal/JvmViewModelProviders;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JvmViewModelProviders {
    /* JADX INFO: renamed from: a */
    public static ViewModel m9193a(Class modelClass) throws InvocationTargetException {
        Intrinsics.m18599g(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.m18596d(objNewInstance);
            return (ViewModel) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        }
    }
}
