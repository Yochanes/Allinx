package io.intercom.android.sdk.blocks.lib.interfaces;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ButtonBlock {
    View addButton(Spanned spanned, String str, BlockAlignment blockAlignment, BlockMetadata blockMetadata, ViewGroup viewGroup);
}
