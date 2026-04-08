package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@BindingMethods
@RestrictTo
public class AutoCompleteTextViewBindingAdapter {

    /* JADX INFO: compiled from: Proguard */
    public interface FixText {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface IsValid {
    }

    /* JADX INFO: renamed from: androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15111 implements AutoCompleteTextView.Validator {
        @Override // android.widget.AutoCompleteTextView.Validator
        public final boolean isValid(CharSequence charSequence) {
            return true;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public final CharSequence fixText(CharSequence charSequence) {
            return charSequence;
        }
    }
}
