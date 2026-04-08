package autodispose2.lifecycle;

import autodispose2.ScopeProvider;
import com.google.errorprone.annotations.DoNotMock;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@DoNotMock("Use TestLifecycleScopeProvider instead")
public interface LifecycleScopeProvider<E> extends ScopeProvider {
    /* JADX INFO: renamed from: a */
    Object mo12372a();

    /* JADX INFO: renamed from: b */
    Observable mo12373b();

    /* JADX INFO: renamed from: c */
    CorrespondingEventsFunction mo12374c();
}
