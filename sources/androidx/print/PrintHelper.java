package androidx.print;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class PrintHelper {

    /* JADX INFO: renamed from: androidx.print.PrintHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    class AsyncTaskC20941 extends AsyncTask<Void, Void, Throwable> {
        @Override // android.os.AsyncTask
        public final Throwable doInBackground(Void[] voidArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Throwable th) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnPrintFinishCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class PrintUriAdapter extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a */
        public Bitmap f31399a;

        /* JADX INFO: renamed from: androidx.print.PrintHelper$PrintUriAdapter$1 */
        /* JADX INFO: compiled from: Proguard */
        class AsyncTaskC20951 extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CancellationSignal f31400a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PrintAttributes f31401b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ PrintAttributes f31402c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f31403d;

            /* JADX INFO: renamed from: androidx.print.PrintHelper$PrintUriAdapter$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: Proguard */
            class AnonymousClass1 implements CancellationSignal.OnCancelListener {
                public AnonymousClass1() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    PrintUriAdapter.this.getClass();
                    throw null;
                }
            }

            public AsyncTaskC20951(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f31400a = cancellationSignal;
                this.f31401b = printAttributes;
                this.f31402c = printAttributes2;
                this.f31403d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            public final Bitmap doInBackground(Uri[] uriArr) {
                try {
                    PrintUriAdapter.this.getClass();
                    throw null;
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final void onCancelled(Bitmap bitmap) {
                this.f31403d.onLayoutCancelled();
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                super.onPostExecute(bitmap2);
                PrintUriAdapter printUriAdapter = PrintUriAdapter.this;
                if (bitmap2 != null) {
                    throw null;
                }
                printUriAdapter.f31399a = bitmap2;
                PrintDocumentAdapter.LayoutResultCallback layoutResultCallback = this.f31403d;
                if (bitmap2 != null) {
                    layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), true ^ this.f31401b.equals(this.f31402c));
                } else {
                    layoutResultCallback.onLayoutFailed(null);
                }
            }

            @Override // android.os.AsyncTask
            public final void onPreExecute() {
                this.f31400a.setOnCancelListener(new AnonymousClass1());
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
            super.onFinish();
            throw null;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) throws Throwable {
            synchronized (this) {
                try {
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f31399a != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                new AsyncTaskC20951(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class PrintBitmapAdapter extends PrintDocumentAdapter {
        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
        }
    }
}
