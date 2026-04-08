package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class AccountPicker {

    /* JADX INFO: compiled from: Proguard */
    public static class AccountChooserOptions {

        @Nullable
        private Account zza;
        private boolean zzb;

        @Nullable
        private ArrayList zzc;

        @Nullable
        private ArrayList zzd;
        private boolean zze;

        @Nullable
        private String zzf;

        @Nullable
        private Bundle zzg;
        private boolean zzh;
        private int zzi;

        @Nullable
        private String zzj;
        private boolean zzk;

        @Nullable
        private zza zzl;

        @Nullable
        private String zzm;
        private boolean zzn;
        private boolean zzo;

        /* JADX INFO: compiled from: Proguard */
        public static class Builder {

            @Nullable
            private Account zza;

            @Nullable
            private ArrayList zzb;

            @Nullable
            private ArrayList zzc;
            private boolean zzd = false;

            @Nullable
            private String zze;

            @Nullable
            private Bundle zzf;

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                AccountChooserOptions.zzj(accountChooserOptions, this.zzc);
                AccountChooserOptions.zzk(accountChooserOptions, this.zzb);
                AccountChooserOptions.zzl(accountChooserOptions, this.zzd);
                AccountChooserOptions.zzm(accountChooserOptions, null);
                AccountChooserOptions.zzp(accountChooserOptions, null);
                AccountChooserOptions.zzq(accountChooserOptions, this.zzf);
                AccountChooserOptions.zzs(accountChooserOptions, this.zza);
                AccountChooserOptions.zzt(accountChooserOptions, false);
                AccountChooserOptions.zzu(accountChooserOptions, false);
                AccountChooserOptions.zzr(accountChooserOptions, null);
                AccountChooserOptions.zzv(accountChooserOptions, 0);
                AccountChooserOptions.zzw(accountChooserOptions, this.zze);
                AccountChooserOptions.zzx(accountChooserOptions, false);
                AccountChooserOptions.zzn(accountChooserOptions, false);
                AccountChooserOptions.zzo(accountChooserOptions, false);
                return accountChooserOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowableAccounts(@Nullable List<Account> list) {
                this.zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowableAccountsTypes(@Nullable List<String> list) {
                this.zzc = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAlwaysShowAccountPicker(boolean z2) {
                this.zzd = z2;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSelectedAccount(@Nullable Account account) {
                this.zza = account;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTitleOverrideText(@Nullable String str) {
                this.zze = str;
                return this;
            }
        }

        public static /* bridge */ /* synthetic */ boolean zzA(AccountChooserOptions accountChooserOptions) {
            boolean z2 = accountChooserOptions.zzo;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzB(AccountChooserOptions accountChooserOptions) {
            boolean z2 = accountChooserOptions.zzb;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzC(AccountChooserOptions accountChooserOptions) {
            boolean z2 = accountChooserOptions.zzh;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzD(AccountChooserOptions accountChooserOptions) {
            boolean z2 = accountChooserOptions.zzk;
            return false;
        }

        public static /* bridge */ /* synthetic */ int zza(AccountChooserOptions accountChooserOptions) {
            int i = accountChooserOptions.zzi;
            return 0;
        }

        public static /* bridge */ /* synthetic */ Account zzb(AccountChooserOptions accountChooserOptions) {
            return accountChooserOptions.zza;
        }

        public static /* bridge */ /* synthetic */ Bundle zzc(AccountChooserOptions accountChooserOptions) {
            return accountChooserOptions.zzg;
        }

        public static /* bridge */ /* synthetic */ zza zzd(AccountChooserOptions accountChooserOptions) {
            zza zzaVar = accountChooserOptions.zzl;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zze(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.zzj;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zzf(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.zzm;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zzg(AccountChooserOptions accountChooserOptions) {
            return accountChooserOptions.zzf;
        }

        public static /* bridge */ /* synthetic */ ArrayList zzh(AccountChooserOptions accountChooserOptions) {
            return accountChooserOptions.zzd;
        }

        public static /* bridge */ /* synthetic */ ArrayList zzi(AccountChooserOptions accountChooserOptions) {
            return accountChooserOptions.zzc;
        }

        public static /* bridge */ /* synthetic */ void zzj(AccountChooserOptions accountChooserOptions, ArrayList arrayList) {
            accountChooserOptions.zzd = arrayList;
        }

        public static /* bridge */ /* synthetic */ void zzk(AccountChooserOptions accountChooserOptions, ArrayList arrayList) {
            accountChooserOptions.zzc = arrayList;
        }

        public static /* bridge */ /* synthetic */ void zzl(AccountChooserOptions accountChooserOptions, boolean z2) {
            accountChooserOptions.zze = z2;
        }

        public static /* bridge */ /* synthetic */ void zzm(AccountChooserOptions accountChooserOptions, zza zzaVar) {
            accountChooserOptions.zzl = null;
        }

        public static /* bridge */ /* synthetic */ void zzn(AccountChooserOptions accountChooserOptions, boolean z2) {
            accountChooserOptions.zzn = false;
        }

        public static /* bridge */ /* synthetic */ void zzo(AccountChooserOptions accountChooserOptions, boolean z2) {
            accountChooserOptions.zzo = false;
        }

        public static /* bridge */ /* synthetic */ void zzp(AccountChooserOptions accountChooserOptions, String str) {
            accountChooserOptions.zzj = null;
        }

        public static /* bridge */ /* synthetic */ void zzq(AccountChooserOptions accountChooserOptions, Bundle bundle) {
            accountChooserOptions.zzg = bundle;
        }

        public static /* bridge */ /* synthetic */ void zzr(AccountChooserOptions accountChooserOptions, String str) {
            accountChooserOptions.zzm = null;
        }

        public static /* bridge */ /* synthetic */ void zzs(AccountChooserOptions accountChooserOptions, Account account) {
            accountChooserOptions.zza = account;
        }

        public static /* bridge */ /* synthetic */ void zzt(AccountChooserOptions accountChooserOptions, boolean z2) {
            accountChooserOptions.zzb = false;
        }

        public static /* bridge */ /* synthetic */ void zzu(AccountChooserOptions accountChooserOptions, boolean z2) {
            accountChooserOptions.zzh = false;
        }

        public static /* bridge */ /* synthetic */ void zzv(AccountChooserOptions accountChooserOptions, int i) {
            accountChooserOptions.zzi = 0;
        }

        public static /* bridge */ /* synthetic */ void zzw(AccountChooserOptions accountChooserOptions, String str) {
            accountChooserOptions.zzf = str;
        }

        public static /* bridge */ /* synthetic */ void zzx(AccountChooserOptions accountChooserOptions, boolean z2) {
            accountChooserOptions.zzk = false;
        }

        public static /* bridge */ /* synthetic */ boolean zzy(AccountChooserOptions accountChooserOptions) {
            return accountChooserOptions.zze;
        }

        public static /* bridge */ /* synthetic */ boolean zzz(AccountChooserOptions accountChooserOptions) {
            boolean z2 = accountChooserOptions.zzn;
            return false;
        }
    }

    private AccountPicker() {
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z2);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        AccountChooserOptions.zzD(accountChooserOptions);
        AccountChooserOptions.zze(accountChooserOptions);
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        AccountChooserOptions.zzd(accountChooserOptions);
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        AccountChooserOptions.zzB(accountChooserOptions);
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        AccountChooserOptions.zzD(accountChooserOptions);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", AccountChooserOptions.zzi(accountChooserOptions));
        if (AccountChooserOptions.zzh(accountChooserOptions) != null) {
            intent.putExtra("allowableAccountTypes", (String[]) AccountChooserOptions.zzh(accountChooserOptions).toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", AccountChooserOptions.zzc(accountChooserOptions));
        intent.putExtra("selectedAccount", AccountChooserOptions.zzb(accountChooserOptions));
        AccountChooserOptions.zzB(accountChooserOptions);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", AccountChooserOptions.zzy(accountChooserOptions));
        intent.putExtra("descriptionTextOverride", AccountChooserOptions.zzg(accountChooserOptions));
        AccountChooserOptions.zzC(accountChooserOptions);
        intent.putExtra("setGmsCoreAccount", false);
        AccountChooserOptions.zzf(accountChooserOptions);
        intent.putExtra("realClientPackage", (String) null);
        AccountChooserOptions.zza(accountChooserOptions);
        intent.putExtra("overrideTheme", 0);
        AccountChooserOptions.zzD(accountChooserOptions);
        intent.putExtra("overrideCustomTheme", 0);
        AccountChooserOptions.zze(accountChooserOptions);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        AccountChooserOptions.zzD(accountChooserOptions);
        AccountChooserOptions.zzd(accountChooserOptions);
        AccountChooserOptions.zzz(accountChooserOptions);
        AccountChooserOptions.zzA(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
