package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.blocks.lib.interfaces.CodeBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class Code implements CodeBlock {
    private TextView getCodeBlockView(Spanned spanned, Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(context.getColor(C5101R.color.intercom_white));
        textView.setTextSize(14.0f);
        textView.setText(spanned);
        textView.setPadding(ScreenUtils.dpToPx(14.0f, context), ScreenUtils.dpToPx(12.0f, context), ScreenUtils.dpToPx(14.0f, context), ScreenUtils.dpToPx(14.0f, context));
        textView.setBackgroundResource(C5101R.color.intercom_slate_grey_two);
        textView.setTypeface(Typeface.MONOSPACE);
        BlockUtils.createLayoutParams(textView, -2, -2);
        BlockUtils.setDefaultMarginBottom(textView);
        return textView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.CodeBlock
    public View addCode(Spanned spanned, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        TextView codeBlockView = getCodeBlockView(spanned, viewGroup.getContext());
        BlockUtils.setLayoutMarginsAndGravity(codeBlockView, 8388611, blockMetadata.isLastObject());
        return codeBlockView;
    }
}
