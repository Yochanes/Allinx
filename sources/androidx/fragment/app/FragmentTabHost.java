package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import androidx.annotation.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a */
    public TabHost.OnTabChangeListener f24702a;

    /* JADX INFO: compiled from: Proguard */
    public static class DummyTabFactory implements TabHost.TabContentFactory {
        @Override // android.widget.TabHost.TabContentFactory
        public final View createTabContent(String str) {
            View view = new View(null);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16811();

        /* JADX INFO: renamed from: a */
        public String f24703a;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C16811 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f24703a = parcel.readString();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            return AbstractC0000a.m19p(sb, this.f24703a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f24703a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TabInfo {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f24703a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24703a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        TabHost.OnTabChangeListener onTabChangeListener = this.f24702a;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f24702a = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
