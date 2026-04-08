package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@BindingMethods
@RestrictTo
public class SearchViewBindingAdapter {

    /* JADX INFO: renamed from: androidx.databinding.adapters.SearchViewBindingAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15191 implements SearchView.OnQueryTextListener {
        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextChange(String str) {
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.adapters.SearchViewBindingAdapter$2 */
    /* JADX INFO: compiled from: Proguard */
    class C15202 implements SearchView.OnSuggestionListener {
        @Override // android.widget.SearchView.OnSuggestionListener
        public final boolean onSuggestionClick(int i) {
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public final boolean onSuggestionSelect(int i) {
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(11)
    public interface OnQueryTextChange {
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(11)
    public interface OnQueryTextSubmit {
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(11)
    public interface OnSuggestionClick {
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(11)
    public interface OnSuggestionSelect {
    }
}
