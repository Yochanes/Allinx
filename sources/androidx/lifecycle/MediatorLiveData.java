package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {

    /* JADX INFO: renamed from: l */
    public SafeIterableMap f24927l;

    /* JADX INFO: compiled from: Proguard */
    public static class Source<V> implements Observer<V> {

        /* JADX INFO: renamed from: a */
        public final LiveData f24928a;

        /* JADX INFO: renamed from: b */
        public final Observer f24929b;

        /* JADX INFO: renamed from: c */
        public int f24930c = -1;

        public Source(LiveData liveData, Observer observer) {
            this.f24928a = liveData;
            this.f24929b = observer;
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a */
        public final void mo1166a(Object obj) {
            int i = this.f24930c;
            int i2 = this.f24928a.f24913g;
            if (i != i2) {
                this.f24930c = i2;
                this.f24929b.mo1166a(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m9153b() {
            this.f24928a.m9143f(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* JADX INFO: renamed from: g */
    public void mo9114g() {
        Iterator it = this.f24927l.iterator();
        while (it.hasNext()) {
            ((Source) ((Map.Entry) it.next()).getValue()).m9153b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* JADX INFO: renamed from: h */
    public void mo9144h() {
        Iterator it = this.f24927l.iterator();
        while (it.hasNext()) {
            Source source = (Source) ((Map.Entry) it.next()).getValue();
            source.f24928a.m9146j(source);
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo961l(LiveData liveData, Observer observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        Source source = new Source(liveData, observer);
        Source source2 = (Source) this.f24927l.mo807c(liveData, source);
        if (source2 != null && source2.f24929b != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (source2 == null && this.f24909c > 0) {
            source.m9153b();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9152m(LiveData liveData) {
        Source source = (Source) this.f24927l.mo808d(liveData);
        if (source != null) {
            source.f24928a.m9146j(source);
        }
    }
}
