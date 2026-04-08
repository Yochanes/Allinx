package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ChildHelper {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.C21465 f31533a;

    /* JADX INFO: renamed from: b */
    public final Bucket f31534b = new Bucket();

    /* JADX INFO: renamed from: c */
    public final ArrayList f31535c = new ArrayList();

    /* JADX INFO: compiled from: Proguard */
    public static class Bucket {

        /* JADX INFO: renamed from: a */
        public long f31536a = 0;

        /* JADX INFO: renamed from: b */
        public Bucket f31537b;

        /* JADX INFO: renamed from: a */
        public final void m11540a(int i) {
            if (i < 64) {
                this.f31536a &= ~(1 << i);
                return;
            }
            Bucket bucket = this.f31537b;
            if (bucket != null) {
                bucket.m11540a(i - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m11541b(int i) {
            Bucket bucket = this.f31537b;
            if (bucket == null) {
                return i >= 64 ? Long.bitCount(this.f31536a) : Long.bitCount(this.f31536a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f31536a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f31536a) + bucket.m11541b(i - 64);
        }

        /* JADX INFO: renamed from: c */
        public final void m11542c() {
            if (this.f31537b == null) {
                this.f31537b = new Bucket();
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m11543d(int i) {
            if (i < 64) {
                return (this.f31536a & (1 << i)) != 0;
            }
            m11542c();
            return this.f31537b.m11543d(i - 64);
        }

        /* JADX INFO: renamed from: e */
        public final void m11544e(int i, boolean z2) {
            if (i >= 64) {
                m11542c();
                this.f31537b.m11544e(i - 64, z2);
                return;
            }
            long j = this.f31536a;
            boolean z3 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f31536a = ((j & (~j2)) << 1) | (j & j2);
            if (z2) {
                m11547h(i);
            } else {
                m11540a(i);
            }
            if (z3 || this.f31537b != null) {
                m11542c();
                this.f31537b.m11544e(0, z3);
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m11545f(int i) {
            if (i >= 64) {
                m11542c();
                return this.f31537b.m11545f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f31536a;
            boolean z2 = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f31536a = j3;
            long j4 = j - 1;
            this.f31536a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            Bucket bucket = this.f31537b;
            if (bucket != null) {
                if (bucket.m11543d(0)) {
                    m11547h(63);
                }
                this.f31537b.m11545f(0);
            }
            return z2;
        }

        /* JADX INFO: renamed from: g */
        public final void m11546g() {
            this.f31536a = 0L;
            Bucket bucket = this.f31537b;
            if (bucket != null) {
                bucket.m11546g();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m11547h(int i) {
            if (i < 64) {
                this.f31536a |= 1 << i;
            } else {
                m11542c();
                this.f31537b.m11547h(i - 64);
            }
        }

        public final String toString() {
            if (this.f31537b == null) {
                return Long.toBinaryString(this.f31536a);
            }
            return this.f31537b.toString() + "xx" + Long.toBinaryString(this.f31536a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
    }

    public ChildHelper(RecyclerView.C21465 c21465) {
        this.f31533a = c21465;
    }

    /* JADX INFO: renamed from: a */
    public final void m11534a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView.C21465 c21465 = this.f31533a;
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : m11537d(i);
        this.f31534b.m11544e(childCount, z2);
        if (z2) {
            this.f31535c.add(view);
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }
        RecyclerView.ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt2 != null) {
            if (!childViewHolderInt2.isTmpDetached() && !childViewHolderInt2.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt2);
                throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, sb));
            }
            childViewHolderInt2.clearTmpDetachFlag();
        }
        RecyclerView.access$000(recyclerView, view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final View m11535b(int i) {
        return RecyclerView.this.getChildAt(m11537d(i));
    }

    /* JADX INFO: renamed from: c */
    public final int m11536c() {
        return RecyclerView.this.getChildCount() - this.f31535c.size();
    }

    /* JADX INFO: renamed from: d */
    public final int m11537d(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            Bucket bucket = this.f31534b;
            int iM11541b = i - (i2 - bucket.m11541b(i2));
            if (iM11541b == 0) {
                while (bucket.m11543d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM11541b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m11538e(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild != -1) {
            Bucket bucket = this.f31534b;
            if (!bucket.m11543d(iIndexOfChild)) {
                return iIndexOfChild - bucket.m11541b(iIndexOfChild);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final void m11539f(View view) {
        if (this.f31535c.remove(view)) {
            this.f31533a.m11649a(view);
        }
    }

    public final String toString() {
        return this.f31534b.toString() + ", hidden list:" + this.f31535c.size();
    }
}
