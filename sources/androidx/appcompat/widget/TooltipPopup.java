package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class TooltipPopup {

    /* JADX INFO: renamed from: a */
    public final Context f1477a;

    /* JADX INFO: renamed from: b */
    public final View f1478b;

    /* JADX INFO: renamed from: c */
    public final TextView f1479c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f1480d;

    /* JADX INFO: renamed from: e */
    public final Rect f1481e;

    /* JADX INFO: renamed from: f */
    public final int[] f1482f;

    /* JADX INFO: renamed from: g */
    public final int[] f1483g;

    public TooltipPopup(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1480d = layoutParams;
        this.f1481e = new Rect();
        this.f1482f = new int[2];
        this.f1483g = new int[2];
        this.f1477a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1478b = viewInflate;
        this.f1479c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = MTCommonConstants.MainWhat.ON_SERVICE_DISCONNECTED;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
