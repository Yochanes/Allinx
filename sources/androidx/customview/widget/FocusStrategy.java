package androidx.customview.widget;

import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class FocusStrategy {

    /* JADX INFO: compiled from: Proguard */
    public interface BoundsAdapter<T> {
        /* JADX INFO: renamed from: a */
        void mo8212a(Object obj, Rect rect);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CollectionAdapter<T, V> {
        /* JADX INFO: renamed from: a */
        AccessibilityNodeInfoCompat mo8213a(SparseArrayCompat sparseArrayCompat, int i);

        /* JADX INFO: renamed from: b */
        int mo8214b(SparseArrayCompat sparseArrayCompat);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SequentialComparator<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final Rect f23627a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f23628b = new Rect();

        /* JADX INFO: renamed from: c */
        public final boolean f23629c;

        /* JADX INFO: renamed from: d */
        public final BoundsAdapter f23630d;

        public SequentialComparator(boolean z2, BoundsAdapter boundsAdapter) {
            this.f23629c = z2;
            this.f23630d = boundsAdapter;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            BoundsAdapter boundsAdapter = this.f23630d;
            Rect rect = this.f23627a;
            boundsAdapter.mo8212a(obj, rect);
            Rect rect2 = this.f23628b;
            boundsAdapter.mo8212a(obj2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            boolean z2 = this.f23629c;
            if (i3 < i4) {
                return z2 ? 1 : -1;
            }
            if (i3 > i4) {
                return z2 ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return z2 ? 1 : -1;
            }
            if (i7 > i8) {
                return z2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8215a(int i, Rect rect, Rect rect2, Rect rect3) {
        int i2;
        int i3;
        boolean zM8216b = m8216b(i, rect, rect2);
        if (m8216b(i, rect, rect3) || !zM8216b) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            int iM8218d = m8218d(i, rect, rect2);
                            if (i == 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i == 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i == 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iM8218d >= Math.max(1, i2 - i3)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8216b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8217c(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: d */
    public static int m8218d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: e */
    public static int m8219e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
