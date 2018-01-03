<%--
  Created by IntelliJ IDEA.
  User: TIAN
  Date: 2018/1/2
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>大型批发市场管理系统</title>

    <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

    <link rel="icon" href="/favicon.ico">
    <link rel="icon" type="image/png" sizes="32x32" href="/assets/images/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="/assets/images/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/assets/images/favicon-16x16.png">

    <meta name="format-detection" content="telephone=no">

</head>

<body>
<nav class="navbar navbar-fixed-top  navbar-without-shadow ">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">
                <img src="/assets/images/elements/redash_logo.svg" class="navbar-brand__img" alt="">
            </a>
        </div>

        <div class="collapse navbar-collapse" id="navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a data-track data-track-location='header' href="/features/">Features</a></li>
                <li><a data-track data-track-location='header' href="/help/">Help</a></li>
                <li><a data-track data-track-location='header' href="https://app.redash.io/">Login</a></li>
                <li><a data-track data-track-location='header' track-event='Clicked Get Started' href="/get-started/" class="btn btn-danger navbar-btn">Get Started</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container -->
</nav>


<main>
    <section class="section section--hero bg-blue-gray">
        <div class="container">
            <h1 class="text-center text-white mb-xs">Make Your Company Data Driven</h1>
            <h3 class="text-center font-light text-white">Connect to any data source, easily visualize and share your data</h3>
            <div class="text-center mb-sm">
                <a data-track data-track-location='hero' track-event='Clicked Get Started' href="/get-started/" class="btn btn-danger">Get Started</a>
            </div>

            <div class="screens-carousel-holder">
                <div class="browser-toolbar">
                    <div class="browser-toolbar__btns">
                        <div class="browser-toolbar__btn">
                        </div><!-- browser-toolbar__btn -->
                    </div><!-- browser-toolbar__btns -->
                </div><!-- browser-toolbar -->

                <div class="screens-carousel">
                    <div>
                        <img src="assets/images/temp/redash_screenshot_query-slide-1.png" class="full-width" alt="">
                    </div>

                    <div>
                        <img src="assets/images/temp/redash_screenshot_vis-slide-2.png" class="full-width hidden" alt="">
                    </div>

                    <div>
                        <img src="assets/images/temp/redash_screenshot_dashboard-slide-3.png" class="full-width hidden" alt="">
                    </div>
                </div><!-- screens-carousel -->
            </div><!-- screens-carousel -->

        </div><!-- container -->
    </section><!-- section -->

    <section class="section section--small" id="anchor">
        <div class="container">
            <h3 class="text-center mb-lg">Join the 1000s of teams already using Redash.</h3>
            <div id="brands-carousel" class="text-center">

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/user_soundcloud.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">SoundCloud</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/cloudflare_logo.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Cloudflare</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/user_sentry.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Sentry</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_outbrain.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Outbrain</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/nexar_logo.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Nexar</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_healthjoy.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">HealthJoy</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_interlude.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Interlude</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/user_hackerrank.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">HackerRank</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/user_bendingspoons.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Bending Spoons</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/hailo-logo.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Hailo</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_ipros.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Ipros</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_joytunes.jpeg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">JoyTunes</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_komoona.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Komoona</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_ravello.jpg" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Ravello</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_sitebooster.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">SiteBooster</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_anyclip_logo.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Anyclip</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_bringg.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Bringg</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_fundbox.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Fundbox</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_easytaxi.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">EasyTaxi</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_gogobot.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Gogobot</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_nextpeer.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">NextPeer</p>
                </div>

                <div>
                    <div class="carousel__logo-holder">
                        <img src="/assets/images/temp/user_drivy.png" class="carousel__logo" alt="">
                    </div><!-- carousel__logo-holder -->
                    <p class="carousel__title">Drivy</p>
                </div>

            </div><!-- brands-carousel -->
        </div><!-- container -->
    </section><!-- section -->


    <section class="section section--small bg-mutted-soft text-center">
        <div class="container">
            <h3 class="font-light mb-xs"><i class="fa fa-heart-o" aria-hidden="true"></i> Redash is open source</h3>
            <p>Customize and add features, no lock-in, contribute back to the community.</p>
            <a class="github-button" href="https://github.com/getredash/redash" data-style="mega" data-count-href="/getredash/redash/stargazers" data-count-api="/repos/getredash/redash#stargazers_count" data-count-aria-label="# stargazers on GitHub" aria-label="Star getredash/redash on GitHub">Star</a>
        </div><!-- container -->
    </section><!-- section -->

    <section class="section section--small text-center">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <h3><i class="fa fa-list-alt" aria-hidden="true"></i> Query</h3>
                    <p>One place to query all your data sources, in your browser</p>
                </div>
                <div class="col-md-4">
                    <h3><i class="fa fa-signal" aria-hidden="true"></i> Visualize</h3>
                    <p>Easily convert your data into rich visualizations, and collect them into a dashboard.</p>
                </div>
                <div class="col-md-4">
                    <h3><i class="fa fa-users" aria-hidden="true"></i> Collaborate</h3>
                    <p>Share your findings, fork others’ and create new insights.</p>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4">
                    <h3><i class="fa fa-tasks" aria-hidden="true"></i> All your data in one place</h3>
                    <p>Create dashboards or merge data from multiple data sources.</p>
                </div>
                <div class="col-md-4">
                    <h3><i class="fa fa-random" aria-hidden="true"></i> Interactive</h3>
                    <p>Use filters and parameters to allow users to play with results without having to write SQL queries.</p>
                </div>
                <div class="col-md-4">
                    <h3><i class="fa fa-exclamation-triangle" aria-hidden="true"></i> Alerts</h3>
                    <p>Make your data come to you, proactively alert you on important changes.</p>
                </div>
            </div>
        </div><!-- container -->
    </section><!-- section -->


    <section class="section section--small bg-mutted-soft text-center">
        <div class="container">
            <h2 class="font-light">Query All the Data Sources You Need</h2>
            <h5 class="font-light">Redash supports SQL, NoSQL, Big Data and API data sources - query data from different sources and types to answer complex issues.</h5>

            <div class="cards cards--elastic">








                <a href="/data-sources/amazon-redshift" class="card__item">
                    <div class="card__item-brand">
                        <img src="/assets/images/temp/AmazonRedshift.png" class="card__item-brand_img" alt="Amazon Redshift">
                    </div><!-- card__brand -->
                    <p class="card__item-title">Amazon Redshift</p>
                </a>









                <a href="/data-sources/elasticsearch" class="card__item">
                    <div class="card__item-brand">
                        <img src="/assets/images/temp/ElasticSearch2.png" class="card__item-brand_img" alt="ElasticSearch">
                    </div><!-- card__brand -->
                    <p class="card__item-title">ElasticSearch</p>
                </a>



                <a href="/data-sources/google-bigquery" class="card__item">
                    <div class="card__item-brand">
                        <img src="/assets/images/temp/BigQuery.png" class="card__item-brand_img" alt="Google BigQuery">
                    </div><!-- card__brand -->
                    <p class="card__item-title">Google BigQuery</p>
                </a>















                <a href="/data-sources/mongodb" class="card__item">
                    <div class="card__item-brand">
                        <img src="/assets/images/temp/Mongo2.png" class="card__item-brand_img" alt="MongoDB">
                    </div><!-- card__brand -->
                    <p class="card__item-title">MongoDB</p>
                </a>



                <a href="/data-sources/mysql" class="card__item">
                    <div class="card__item-brand">
                        <img src="/assets/images/temp/MySQL.png" class="card__item-brand_img" alt="MySQL">
                    </div><!-- card__brand -->
                    <p class="card__item-title">MySQL</p>
                </a>





                <a href="/data-sources/postgresql" class="card__item">
                    <div class="card__item-brand">
                        <img src="/assets/images/temp/PostgreSQL.png" class="card__item-brand_img" alt="PostgreSQL">
                    </div><!-- card__brand -->
                    <p class="card__item-title">PostgreSQL</p>
                </a>










            </div>

            <a href="/integrations" class="btn btn-danger-ghost btn-long text-uppercase">See all supported datasources and integrations</a>

        </div><!-- container -->
    </section><!-- section -->

    <section class="section section--small section--has-triangle section--has-triangle-gray bg-gray">
        <div class="container">
            <h2 class="text-center mb-xs h1">Get Started with Redash for <span class="font-medium text-danger">Free</span></h2>
            <p class="lead text-center mb-sm">Easy setup. Query and visualize in minutes.</p>
        </div><!-- container -->
    </section><!-- section -->

    <section class="section bg-mutted-soft">
        <div class="container">
            <div class="row text-center">
                <div class="col-sm-6">
                    <h3 class="mb-xs">Plug and Play</h3>
                    <p class="mb-xs">Hosted by Redash</p>
                    <p>Don't worry about installations, hosting and upgrades.<br> All plans include a 30-day free trial. No credit card required.</p>
                    <a data-track data-track-location='get-started' data-track-event='Start Trial' href="https://app.redash.io/signup" class="btn btn-danger btn-long text-uppercase">Start Trial</a>
                    <br>
                    <small><a data-track data-track-location='get-started' href="/pricing" class="underline">See plans</a></small>
                </div><!-- col -->

                <div class="col-sm-6">
                    <h3 class="mb-xs">Open Source</h3>
                    <p class="mb-xs">Self hosted</p>
                    <p>Maximum flexibility in your own environment.<br> Friendly and permissive license (BSD-3)</p>
                    <a data-track data-track-location='get-started' data-track-event='Clicked Quick Start Guide' href="https://redash.io/help-onpremise/setup/setting-up-redash-instance.html" class="btn btn-danger-ghost btn-long text-uppercase">Setup guide</a>
                </div><!-- col -->
            </div><!-- row -->
        </div><!-- container -->
    </section><!-- section -->


    <script async defer src="https://buttons.github.io/buttons.js"></script>

</main>

<footer class="footer">
    <div class="container">
        <div class="row">

            <div class="col-lg-2 col-md-2 col-sm-4 footer__item">
                <h3 class="footer__title">Product</h3>
                <ul class="footer__list">

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/features/" class="footer__list-link">Features</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/integrations/" class="footer__list-link">Integrations</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/slack/" class="footer__list-link">Slack Bot</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/pricing/" class="footer__list-link">Pricing</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="https://demo.redash.io/" class="footer__list-link">Demo</a>
                    </li>

                </ul><!-- footer__list -->
            </div><!-- col -->

            <div class="col-lg-2 col-md-2 col-sm-4 footer__item">
                <h3 class="footer__title">Company</h3>
                <ul class="footer__list">

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="https://blog.redash.io/" class="footer__list-link">Blog</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/terms.html" class="footer__list-link">Terms of Service</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/privacy.html" class="footer__list-link">Privacy Policy</a>
                    </li>

                </ul><!-- footer__list -->
            </div><!-- col -->

            <div class="col-lg-2 col-md-2 col-sm-4 footer__item">
                <h3 class="footer__title">Help</h3>
                <ul class="footer__list">

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="/help/" class="footer__list-link">User Guide</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="https://discuss.redash.io/" class="footer__list-link">Forum</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="https://gitter.im/getredash/redash" class="footer__list-link">Gitter</a>
                    </li>

                    <li class="footer__list-item">
                        <a data-track data-track-location='footer' href="http://slack.redash.io/" class="footer__list-link">Slack</a>
                    </li>

                </ul><!-- footer__list -->
            </div><!-- col -->


            <div class="col-lg-4 col-lg-offset-2 col-md-5 col-md-offset-1 col-sm-12 footer__item">
                <h3 class="footer__title">Newsletter</h3>
                <p>Subscribe to get product updates about Redash, including notifications when new releases are available.</p>

                <form class="form-inline footer__form newsletter-form">
                    <div class="form-group">
                        <!-- real people should not fill this in and expect good things - do not remove this or risk form bot signups-->
                        <div style="position: absolute; left: -5000px;"><input type="text" name="b_a905176d2294593084d5264e5_53ca028761" tabindex="-1" value=""></div>
                        <input type="email" class="form-control" id="mc-email" name="EMAIL" placeholder="Email address">
                    </div>
                    <button type="submit" class="btn btn-danger btn-small">Subscribe</button>
                    <label for="mc-email" class="control-label"></label>
                </form>

                <ul class="footer__list footer__list--social">
                    <li class="footer__list-item">
                        <a href="https://github.com/getredash" class="footer__list-link">
                            <i class="fa fa-github-square" aria-hidden="true"></i>
                        </a>
                    </li>
                    <li class="footer__list-item">
                        <a href="https://twitter.com/getredash" class="footer__list-link">
                            <i class="fa fa-twitter-square" aria-hidden="true"></i>
                        </a>
                    </li>
                </ul><!-- footer__list -->
            </div><!-- col -->
        </div><!-- row -->
    </div><!-- container -->
</footer>


<script src="/assets/javascript/vendors-0b8dc3a104.js"></script>

<script src="/assets/javascript/main-85b5cd770a.js"></script>
</body>
</html>
