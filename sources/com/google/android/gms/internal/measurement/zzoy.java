package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoy implements zzov {
    private static final zzir<Long> zza;
    private static final zzir<Long> zzaa;
    private static final zzir<Long> zzab;
    private static final zzir<String> zzac;
    private static final zzir<Long> zzad;
    private static final zzir<String> zzae;
    private static final zzir<Long> zzaf;
    private static final zzir<String> zzag;
    private static final zzir<String> zzah;
    private static final zzir<String> zzai;
    private static final zzir<Long> zzaj;
    private static final zzir<Long> zzak;
    private static final zzir<Long> zzal;
    private static final zzir<Long> zzam;
    private static final zzir<Long> zzan;
    private static final zzir<Long> zzao;
    private static final zzir<Long> zzap;
    private static final zzir<Long> zzaq;
    private static final zzir<Long> zzar;
    private static final zzir<Long> zzas;
    private static final zzir<Long> zzat;
    private static final zzir<Long> zzau;
    private static final zzir<Long> zzav;
    private static final zzir<Long> zzaw;
    private static final zzir<Long> zzax;
    private static final zzir<Long> zzay;
    private static final zzir<Long> zzaz;
    private static final zzir<Long> zzb;
    private static final zzir<String> zzba;
    private static final zzir<Long> zzbb;
    private static final zzir<String> zzbc;
    private static final zzir<Boolean> zzc;
    private static final zzir<Long> zzd;
    private static final zzir<Long> zze;
    private static final zzir<String> zzf;
    private static final zzir<String> zzg;
    private static final zzir<Long> zzh;
    private static final zzir<Long> zzi;
    private static final zzir<String> zzj;
    private static final zzir<Long> zzk;
    private static final zzir<String> zzl;
    private static final zzir<Long> zzm;
    private static final zzir<Long> zzn;
    private static final zzir<Long> zzo;
    private static final zzir<Long> zzp;
    private static final zzir<Long> zzq;
    private static final zzir<Long> zzr;
    private static final zzir<Long> zzs;
    private static final zzir<Long> zzt;
    private static final zzir<Long> zzu;
    private static final zzir<Long> zzv;
    private static final zzir<Long> zzw;
    private static final zzir<Boolean> zzx;
    private static final zzir<String> zzy;
    private static final zzir<Long> zzz;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.ad_id_cache_time", 10000L);
        zzb = zzizVarZza.zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        zzc = zzizVarZza.zza("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        zzd = zzizVarZza.zza("measurement.max_bundles_per_iteration", 100L);
        zze = zzizVarZza.zza("measurement.config.cache_time", 86400000L);
        zzizVarZza.zza("measurement.log_tag", "FA");
        zzizVarZza.zza("measurement.id.config.experiment_id", 0L);
        zzf = zzizVarZza.zza("measurement.config.url_authority", "app-measurement.com");
        zzg = zzizVarZza.zza("measurement.config.url_scheme", "https");
        zzh = zzizVarZza.zza("measurement.upload.debug_upload_interval", 1000L);
        zzi = zzizVarZza.zza("measurement.session.engagement_interval", 3600000L);
        zzj = zzizVarZza.zza("measurement.rb.attribution.event_params", "value|currency");
        zzizVarZza.zza("measurement.id.rb.attribution.app_allowlist", 0L);
        zzk = zzizVarZza.zza("measurement.upload.google_signal_max_queue_time", 605000L);
        zzl = zzizVarZza.zza("measurement.sgtm.google_signal.url", "https://app-measurement.com/s");
        zzm = zzizVarZza.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
        zzn = zzizVarZza.zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        zzo = zzizVarZza.zza("measurement.upload.max_event_parameter_value_length", 100L);
        zzp = zzizVarZza.zza("measurement.store.max_stored_events_per_app", 100000L);
        zzq = zzizVarZza.zza("measurement.experiment.max_ids", 50L);
        zzr = zzizVarZza.zza("measurement.audience.filter_result_max_count", 200L);
        zzs = zzizVarZza.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
        zzt = zzizVarZza.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
        zzu = zzizVarZza.zza("measurement.alarm_manager.minimum_interval", 60000L);
        zzv = zzizVarZza.zza("measurement.upload.minimum_delay", 500L);
        zzw = zzizVarZza.zza("measurement.monitoring.sample_period_millis", 86400000L);
        zzx = zzizVarZza.zza("measurement.config.notify_trigger_uris_on_backgrounded", true);
        zzy = zzizVarZza.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        zzz = zzizVarZza.zza("measurement.upload.realtime_upload_interval", 10000L);
        zzaa = zzizVarZza.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zzizVarZza.zza("measurement.config.cache_time.service", 3600000L);
        zzab = zzizVarZza.zza("measurement.service_client.idle_disconnect_millis", 5000L);
        zzizVarZza.zza("measurement.log_tag.service", "FA-SVC");
        zzac = zzizVarZza.zza("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa");
        zzad = zzizVarZza.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
        zzae = zzizVarZza.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        zzaf = zzizVarZza.zza("measurement.rb.attribution.max_queue_time", 1209600000L);
        zzag = zzizVarZza.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        zzah = zzizVarZza.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        zzai = zzizVarZza.zza("measurement.rb.attribution.uri_scheme", "https");
        zzaj = zzizVarZza.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
        zzak = zzizVarZza.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
        zzal = zzizVarZza.zza("measurement.upload.backoff_period", 43200000L);
        zzam = zzizVarZza.zza("measurement.upload.initial_upload_delay_time", 15000L);
        zzan = zzizVarZza.zza("measurement.upload.interval", 3600000L);
        zzao = zzizVarZza.zza("measurement.upload.max_bundle_size", 65536L);
        zzap = zzizVarZza.zza("measurement.upload.max_bundles", 100L);
        zzaq = zzizVarZza.zza("measurement.upload.max_conversions_per_day", 500L);
        zzar = zzizVarZza.zza("measurement.upload.max_error_events_per_day", 1000L);
        zzas = zzizVarZza.zza("measurement.upload.max_events_per_bundle", 1000L);
        zzat = zzizVarZza.zza("measurement.upload.max_events_per_day", 100000L);
        zzau = zzizVarZza.zza("measurement.upload.max_public_events_per_day", 50000L);
        zzav = zzizVarZza.zza("measurement.upload.max_queue_time", 2419200000L);
        zzaw = zzizVarZza.zza("measurement.upload.max_realtime_events_per_day", 10L);
        zzax = zzizVarZza.zza("measurement.upload.max_batch_size", 65536L);
        zzay = zzizVarZza.zza("measurement.upload.retry_count", 6L);
        zzaz = zzizVarZza.zza("measurement.upload.retry_time", 1800000L);
        zzba = zzizVarZza.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzbb = zzizVarZza.zza("measurement.upload.window_interval", 3600000L);
        zzbc = zzizVarZza.zza("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zza() {
        return zza.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzaa() {
        return zzam.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzab() {
        return zzan.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzac() {
        return zzao.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzad() {
        return zzap.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzae() {
        return zzaq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzaf() {
        return zzar.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzag() {
        return zzas.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzah() {
        return zzat.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzai() {
        return zzau.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzaj() {
        return zzav.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzak() {
        return zzaw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzal() {
        return zzax.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzam() {
        return zzay.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzan() {
        return zzaz.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzao() {
        return zzbb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzap() {
        return zzf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzaq() {
        return zzg.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzar() {
        return zzj.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzas() {
        return zzl.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzat() {
        return zzy.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzau() {
        return zzac.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzav() {
        return zzae.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzaw() {
        return zzag.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzax() {
        return zzah.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzay() {
        return zzai.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzaz() {
        return zzba.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzb() {
        return zzb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final String zzba() {
        return zzbc.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final boolean zzbb() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final boolean zzbc() {
        return zzx.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzd() {
        return zze.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zze() {
        return zzh.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzf() {
        return zzi.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzg() {
        return zzk.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzh() {
        return zzm.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzi() {
        return zzn.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzj() {
        return zzo.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzk() {
        return zzp.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzl() {
        return zzq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzm() {
        return zzr.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzn() {
        return zzs.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzo() {
        return zzt.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzp() {
        return zzu.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzq() {
        return zzv.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzr() {
        return zzw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzs() {
        return zzz.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzt() {
        return zzaa.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzu() {
        return zzab.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzv() {
        return zzad.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzw() {
        return zzaf.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzx() {
        return zzaj.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzy() {
        return zzak.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final long zzz() {
        return zzal.zza().longValue();
    }
}
