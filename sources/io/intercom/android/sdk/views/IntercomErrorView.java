package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.utilities.FontUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomErrorView extends RelativeLayout {
    private Button actionButton;
    private TextView subtitle;
    private TextView titleView;

    public IntercomErrorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(C5101R.id.empty_text_title);
        this.titleView = textView;
        FontUtils.setRobotoMediumTypeface(textView);
        this.subtitle = (TextView) findViewById(C5101R.id.empty_text_subtitle);
        this.actionButton = (Button) findViewById(C5101R.id.action_button);
    }

    public void setActionButtonClickListener(@Nullable View.OnClickListener onClickListener) {
        this.actionButton.setOnClickListener(onClickListener);
    }

    public void setActionButtonText(@StringRes int i) {
        this.actionButton.setText(i);
    }

    public void setActionButtonTextColor(@ColorInt int i) {
        this.actionButton.setTextColor(i);
    }

    public void setActionButtonVisibility(int i) {
        this.actionButton.setVisibility(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
    }

    public void setTitle(@StringRes int i) {
        this.titleView.setText(i);
    }

    public IntercomErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSubtitle(@StringRes int i) {
        this.subtitle.setText(i);
    }
}
