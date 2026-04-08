package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import androidx.core.content.p014pm.AbstractC1430a;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class InputConnectionCompat {

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.InputConnectionCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14741 extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnCommitContentListener f23545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14741(InputConnection inputConnection, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, false);
            this.f23545a = onCommitContentListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            InputContentInfoCompat inputContentInfoCompat = null;
            if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
                inputContentInfoCompat = new InputContentInfoCompat(new InputContentInfoCompat.InputContentInfoCompatApi25Impl(inputContentInfo));
            }
            if (this.f23545a.mo3350a(inputContentInfoCompat, i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2 */
    /* JADX INFO: compiled from: Proguard */
    class C14752 extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ OnCommitContentListener f23546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14752(InputConnection inputConnection, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, false);
            this.f23546a = onCommitContentListener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
            Object[] objArr;
            ResultReceiver resultReceiver;
            OnCommitContentListener onCommitContentListener = this.f23546a;
            boolean zMo3350a = false;
            zMo3350a = false;
            zMo3350a = false;
            zMo3350a = false;
            if (bundle != null) {
                if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                    objArr = false;
                } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                    objArr = true;
                }
                try {
                    resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                    try {
                        Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                        ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                        Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                        int i = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                        Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                        if (uri != null && clipDescription != null) {
                            zMo3350a = onCommitContentListener.mo3350a(new InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
                        }
                        if (resultReceiver != null) {
                            resultReceiver.send(zMo3350a ? 1 : 0, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (resultReceiver != null) {
                            resultReceiver.send(0, null);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    resultReceiver = null;
                }
            }
            if (zMo3350a) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api25Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnCommitContentListener {
        /* JADX INFO: renamed from: a */
        boolean mo3350a(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);
    }

    /* JADX INFO: renamed from: a */
    public static InputConnection m8115a(InputConnection inputConnection, EditorInfo editorInfo, OnCommitContentListener onCommitContentListener) {
        if (editorInfo == null) {
            throw new NullPointerException("editorInfo must be non-null");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            return new C14741(inputConnection, onCommitContentListener);
        }
        String[] strArr = EditorInfoCompat.f23544a;
        if (i >= 25) {
            String[] strArrM7524k = AbstractC1430a.m7524k(editorInfo);
            if (strArrM7524k != null) {
                strArr = strArrM7524k;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr = stringArray;
                }
            }
        }
        return strArr.length == 0 ? inputConnection : new C14752(inputConnection, onCommitContentListener);
    }
}
