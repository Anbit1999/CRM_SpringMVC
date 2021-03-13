<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Dashboard</title>

    <link rel="shortcut icon" href="/assets/images/favicon.ico" />

    <!-- Perfect Scrollbar -->
    <link type="text/css" href="assets/vendor/perfect-scrollbar.css" rel="stylesheet" />

    <!-- App CSS -->
    <link type="text/css" href="assets/css/app.css" rel="stylesheet" />
    <link type="text/css" href="assets/css/app.rtl.css" rel="stylesheet" />

    <!-- Material Design Icons -->
    <link type="text/css" href="assets/css/vendor-material-icons.css" rel="stylesheet" />
    <link type="text/css" href="assets/css/vendor-material-icons.rtl.css" rel="stylesheet" />

    <!-- Font Awesome FREE Icons -->
    <link type="text/css" href="assets/css/vendor-fontawesome-free.css" rel="stylesheet" />
    <link type="text/css" href="assets/css/vendor-fontawesome-free.rtl.css" rel="stylesheet" />

    <link type="text/css" href="assets/css/vendor-flatpickr.css" rel="stylesheet" />
    <link type="text/css" href="assets/css/vendor-flatpickr.rtl.css" rel="stylesheet" />
    <link type="text/css" href="assets/css/vendor-flatpickr-airbnb.css" rel="stylesheet" />
    <link type="text/css" href="assets/css/vendor-flatpickr-airbnb.rtl.css" rel="stylesheet" />

</head>

<body class="layout-fixed">
    <div class="preloader"></div>

    <!-- Header Layout -->
    <div class="mdk-header-layout js-mdk-header-layout">
        <!-- Header -->

        <div id="header" class="mdk-header bg-dark js-mdk-header m-0" data-fixed data-effects="waterfall">
            <div class="mdk-header__content">
                <div class="navbar navbar-expand-sm navbar-main navbar-dark bg-dark pr-0" id="navbar" data-primary>
                    <div class="container">
                        <!-- Navbar toggler -->

                        <button class="navbar-toggler navbar-toggler-right d-block d-md-none" type="button" data-toggle="sidebar">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <!-- Navbar Brand -->
                        <a href="dashboard.html" class="navbar-brand">
                            <img class="navbar-brand-icon" src="assets/images/logo.png" height="50" alt="Cybersoft" />
                        </a>

                        <span class="mr-3"></span>

                        <form class="search-form d-none d-xl-flex flex mr-3" action="fixed-index.html">
                            <button class="btn" type="submit">
                                <i class="material-icons">search</i>
                            </button>
                            <input type="text" class="form-control" placeholder="Search" />
                        </form>

                        <ul class="nav navbar-nav ml-auto d-none d-md-flex border-left">
                            <li class="nav-item dropdown">
                                <a href="#notifications_menu" class="nav-link dropdown-toggle" data-toggle="dropdown" data-caret="false">
                                    <i class="material-icons nav-icon navbar-notifications-indicator">
                                        notifications_none
                                    </i>
                                </a>
                                <div id="notifications_menu" class="dropdown-menu dropdown-menu-right navbar-notifications-menu">
                                    <div class="dropdown-item d-flex align-items-center py-2">
                                        <span class="flex navbar-notifications-menu__title m-0">
                                            Notifications
                                        </span>
                                        <a href="javascript:void(0)" class="text-muted">
                                            <small>Clear all</small>
                                        </a>
                                    </div>
                                    <div class="navbar-notifications-menu__content" data-perfect-scrollbar>
                                        <div class="py-2">
                                            <div class="dropdown-item d-flex">
                                                <div class="mr-3">
                                                    <div class="avatar avatar-sm" style="width: 32px; height: 32px">
                                                        <img src="assets/images/256_daniel-gaffey-1060698-unsplash.jpg" alt="Avatar" class="avatar-img rounded-circle" />
                                                    </div>
                                                </div>
                                                <div class="flex">
                                                    <a href="">Tiến Hoàng</a> đã bình luận trong
                                                    <a href="">Stack</a><br />
                                                    <small class="text-muted">1 phút trước</small>
                                                </div>
                                            </div>
                                            <div class="dropdown-item d-flex">
                                                <div class="mr-3">
                                                    <a href="#">
                                                        <div class="avatar avatar-xs" style="width: 32px; height: 32px">
                                                            <span class="avatar-title bg-purple rounded-circle">
                                                                <i class="material-icons icon-16pt">
                                                                person_add
                                                                </i>
                                                            </span>
                                                        </div>
                                                    </a>
                                                </div>
                                                <div class="flex">
                                                    Người dùng mới <a href="#">Trần Minh</a> đã đăng ký tài khoản<br />
                                                    <small class="text-muted">1 giờ trước.</small>
                                                </div>
                                            </div>
                                            <div class="dropdown-item d-flex">
                                                <div class="mr-3">
                                                    <a href="#">
                                                        <div class="avatar avatar-xs" style="width: 32px; height: 32px">
                                                            <span class="avatar-title rounded-circle">JD</span>
                                                        </div>
                                                    </a>
                                                </div>
                                                <div class="flex">
                                                    <a href="#">Mẫn Nhi</a>
                                                    <small class="text-muted">nhắn bạn:</small><br />
                                                    <div>
                                                        Chào mọi người, vui lòng lưu ý cuộc hẹn lúc 3 giờ chiều
                                                    </div>
                                                    <small class="text-muted">2 phút trước đây</small>
                                                </div>
                                            </div>

                                            <div class="dropdown-item d-flex">
                                                <div class="mr-3">
                                                    <div class="avatar avatar-sm" style="width: 32px; height: 32px">
                                                        <img src="assets/images/256_daniel-gaffey-1060698-unsplash.jpg" alt="Avatar" class="avatar-img rounded-circle" />
                                                    </div>
                                                </div>
                                                <div class="flex">
                                                    <a href="">Tuấn</a> đã bình luận trong
                                                    <a href="">Stack</a><br />
                                                    <small class="text-muted">1 phút trước</small>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <a href="javascript:void(0);" class="dropdown-item text-center navbar-notifications-menu__footer">
                                        View All
                                    </a>
                                </div>
                            </li>
                        </ul>

                        <ul class="nav navbar-nav d-none d-sm-flex border-left navbar-border navbar-height align-items-center">
                            <li class="nav-item dropdown">
                                <a href="#account_menu" class="nav-link dropdown-toggle" data-toggle="dropdown" data-caret="false">
                                    <span class="avatar avatar-sm">
                                        <span class="avatar-title rounded-circle bg-warning">
                                            Tuấn
                                        </span>
                                    </span>
                                </a>
                                <div id="account_menu" class="dropdown-menu dropdown-menu-right">
                                    <div class="dropdown-item-text dropdown-item-text--lh">
                                        <div><strong>Thanh Tuấn</strong></div>
                                        <div>@tuanphan</div>
                                    </div>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item active" href="dashboard.html">
                                        Dashboard
                                    </a>
                                    <a class="dropdown-item" href="profile.html">
                                        My profile
                                    </a>
                                    <a class="dropdown-item" href="account-edit.html">
                                        Edit account
                                    </a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="login.html">Logout</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- // END Header -->

        <!-- Header Layout Content -->
        <div class="mdk-header-layout__content page">
            <div class="page__header mb-0">
                <div class="container page__container">
                    <div class="navbar navbar-secondary navbar-light navbar-expand-sm p-0">
                        <button class="navbar-toggler navbar-toggler-right" data-toggle="collapse" data-target="#navbarsExample03" type="button">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <div class="navbar-collapse collapse" id="navbarsExample03">
                            <ul class="nav navbar-nav flex">
                                <li class="nav-item">
                                    <a class="nav-link active" href="dashboard.html">
                                        Home</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
                                        Project
                                    </a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#">
                                            Manage Project
                                        </a>
                                        <a class="dropdown-item" href="#">
                                            Project Create Project
                                        </a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
                                        User
                                    </a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#">
                                            User List
                                        </a>
                                        <a class="dropdown-item" href="#">
                                            Create User
                                        </a>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Task</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Components</a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="buttons.html">Buttons</a>
                                        <a class="dropdown-item" href="alerts.html">Alerts</a>
                                        <a class="dropdown-item" href="avatars.html">Avatars</a>
                                        <a class="dropdown-item" href="modals.html">Modals</a>
                                        <a class="dropdown-item" href="charts.html">Charts</a>
                                        <a class="dropdown-item" href="icons.html">Icons</a>
                                        <a class="dropdown-item" href="forms.html">Forms</a>
                                        <a class="dropdown-item" href="range-sliders.html">Range Sliders</a>
                                        <a class="dropdown-item" href="datetime.html">Time &amp; Date</a>
                                        <a class="dropdown-item" href="tables.html">Tables</a>
                                        <a class="dropdown-item" href="tabs.html">Tabs</a>
                                        <a class="dropdown-item" href="loaders.html">Loaders</a>
                                        <a class="dropdown-item" href="drag.html">Drag &amp; Drop</a>
                                        <a class="dropdown-item" href="pagination.html">Pagination</a>
                                        <a class="dropdown-item" href="vector-maps.html">Vector Maps</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container page__heading-container">
                <div class="page__heading">
                    <div class="d-flex align-items-center">
                        <div>
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb mb-0">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">
                                        Dashboard
                                    </li>
                                </ol>
                            </nav>
                            <h1 class="m-0">Dashboard</h1>
                        </div>
                        <div class="ml-auto">
                            <a href="" class="btn btn-light"><i class="material-icons icon-16pt text-muted mr-1">settings</i>
                Settings</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container page__container">
                <div class="row card-group-row">
                    <div class="col-lg-3 col-md-4 card-group-row__col">
                        <div class="card card-group-row__card card-shadow">
                            <div class="p-2 d-flex flex-row align-items-center">
                                <div class="avatar avatar-xs mr-2">
                                    <span class="avatar-title rounded-circle text-center bg-primary">
                                        <i class="material-icons text-white icon-18pt">
                                        business
                                        </i>
                                    </span>
                                </div>
                                <a href="#" class="text-dark">
                                    <strong>Companies</strong>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-4 card-group-row__col">
                        <div class="card card-group-row__card card-shadow">
                            <div class="p-2 d-flex flex-row align-items-center">
                                <div class="avatar avatar-xs mr-2">
                                    <span class="avatar-title rounded-circle text-center">
                                        <i class="material-icons text-white icon-18pt">
                                        person_add
                                        </i>
                                    </span>
                                </div>
                                <a href="#" class="text-dark">
                                    <strong>Create New User</strong>
                                </a>
                            </div>
                        </div>
                    </div>


                </div>

                <div class="card">
                    <div class="card-header card-header-large bg-white d-flex align-items-center">
                        <h4 class="card-header__title flex mb-0">Chart Example</h4>
                        <div class="d-flex align-items-center">
                            <label for="chart-switch-toggle" class="mb-0">Show affiliate:</label>
                            <div class="custom-control custom-checkbox-toggle ml-2">
                                <input checked="" aria-checked="true" type="checkbox" id="chart-switch-toggle" class="custom-control-input" role="switch" data-toggle="chart" data-target="#ordersChartSwitch" data-add='{"data":{"datasets":[{"data":[15,10,20,12,7,0,8,16,18,16,10,22],"backgroundColor":"#4EB4A5","label":"Affiliate","barPercentage":"0.5","barThickness":"20"}]}}'
                                />
                                <label class="custom-control-label" for="chart-switch-toggle"><span class="sr-only">Show
                    affiliate</span></label>
                            </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <div class="chart">
                            <canvas id="ordersChartSwitch" class="chart-canvas"></canvas>
                        </div>
                    </div>
                </div>

                <!-- Xep hang -->
                <div class="row">
                    <div class="col-md-6">
                        <div class="card">
                            <div class="card-header card-header-large bg-white">
                                <h4 class="card-header__title">Top Companies</h4>
                            </div>

                            <table class="table table-striped border-bottom mb-0">
                                <tr>
                                    <td style="width: 40px">1.</td>
                                    <td style="width: 200px">
                                        <div>
                                            <a href="#" class="text-15pt d-flex align-items-center">
                                                <i class="material-icons icon-16pt mr-1">business</i>
                                                <strong>Moon Ltd</strong>
                                            </a>
                                        </div>
                                        <small class="text-muted">(2 invoices)</small>
                                    </td>
                                    <td class="text-right" style="width: 100px">
                                        3%
                                        <i class="material-icons icon-16pt text-success">arrow_upward</i>
                                    </td>
                                    <td class="text-right" style="width: 60px">
                                        <div class="badge badge-soft-success">PAID</div>
                                    </td>
                                    <td class="text-right" style="width: 80px">$32,124</td>
                                </tr>

                                <tr>
                                    <td style="width: 40px">3.</td>
                                    <td style="width: 200px">
                                        <div>
                                            <a href="#" class="text-15pt d-flex align-items-center">
                                                <i class="material-icons icon-16pt mr-1">business</i>
                                                <strong>Visual Design</strong>
                                            </a>
                                        </div>
                                        <small class="text-muted">(4 invoices)</small>
                                    </td>
                                    <td class="text-right" style="width: 100px">
                                        12%
                                        <i class="material-icons icon-16pt text-success">arrow_upward</i>
                                    </td>
                                    <td class="text-right" style="width: 60px">
                                        <div class="badge badge-soft-danger">DUE</div>
                                    </td>
                                    <td class="text-right" style="width: 80px">$2,229</td>
                                </tr>
                            </table>

                            <div class="card-footer text-center border-0">
                                <a class="text-muted" href="">View All (391)</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card">
                            <div class="card-header card-header-large bg-white d-flex align-items-center">
                                <h4 class="card-header__title flex m-0">Recently Acitivies</h4>
                                <div data-toggle="flatpickr" data-flatpickr-wrap="true" data-flatpickr-static="true" data-flatpickr-mode="range" data-flatpickr-alt-format="d/m/Y" data-flatpickr-date-format="d/m/Y">
                                    <a href="javascript:void(0)" class="link-date" data-toggle>13/03/2018
                                      <span class="text-muted mx-1">to</span> 20/03/2018
                                    </a>
                                    <input class="d-none" type="hidden" value="13/03/2018 to 20/03/2018" data-input />
                                </div>
                            </div>
                            <div class="card-header card-header-tabs-basic nav" role="tablist">
                                <a href="#activity_all" class="active" data-toggle="tab" role="tab" aria-controls="activity_all" aria-selected="true">All</a>
                                <a href="#activity_purchases" data-toggle="tab" role="tab" aria-controls="activity_purchases" aria-selected="false">Purchases</a>
                                <a href="#activity_emails" data-toggle="tab" role="tab" aria-controls="activity_emails" aria-selected="false">Emails</a>
                                <a href="#activity_quotes" data-toggle="tab" role="tab" aria-controls="activity_quotes" aria-selected="false">Quotes</a>
                            </div>
                            <div class="list-group tab-content list-group-flush">
                                <div class="tab-pane active show fade" id="activity_all">
                                    <div class="list-group-item list-group-item-action d-flex align-items-center">
                                        <div class="avatar avatar-xs mr-3">
                                            <span class="avatar-title rounded-circle bg-purple">
                                              <i class="material-icons">monetization_on</i>
                                            </span>
                                        </div>

                                        <div class="flex">
                                            <div class="d-flex align-items-middle">
                                                <div class="avatar avatar-xxs mr-1">
                                                    <img src="assets/images/256_rsz_1andy-lee-642320-unsplash.jpg" alt="Avatar" class="avatar-img rounded-circle" />
                                                </div>

                                                <strong class="text-15pt mr-1">Jenell D. Matney</strong>
                                            </div>
                                            <small class="text-muted">4 days ago</small>
                                        </div>
                                        <div>$573</div>

                                        <i class="material-icons icon-muted ml-3">arrow_forward</i>
                                    </div>

                                    <div class="list-group-item list-group-item-action d-flex align-items-center">
                                        <div class="avatar avatar-xs mr-3">
                                            <span class="avatar-title rounded-circle bg-teal">
                                              <i class="material-icons">email</i>
                                            </span>
                                        </div>

                                        <div class="flex">
                                            <div class="d-flex align-items-middle">
                                                <div class="avatar avatar-xxs mr-1">
                                                    <img src="assets/images/256_daniel-gaffey-1060698-unsplash.jpg" alt="Avatar" class="avatar-img rounded-circle" />
                                                </div>

                                                <strong class="text-15pt mr-1">Sherri J. Cardenas</strong>
                                            </div>
                                            <small>Improve spacings on Projects page</small>
                                        </div>
                                        <small class="text-muted">3 days ago</small>

                                        <i class="material-icons icon-muted ml-3">arrow_forward</i>
                                    </div>

                                    <div class="list-group-item list-group-item-action d-flex align-items-center bg-light">
                                        <div class="avatar avatar-xs mr-3">
                                            <span class="avatar-title rounded-circle">
                                              <i class="material-icons">monetization_on</i>
                                            </span>
                                        </div>

                                        <div class="flex">
                                            <div class="d-flex align-items-middle">
                                                <div class="avatar avatar-xxs mr-1">
                                                    <img src="assets/images/256_jeremy-banks-798787-unsplash.jpg" alt="Avatar" class="avatar-img rounded-circle" />
                                                </div>

                                                <strong class="text-15pt mr-1">Joseph S. Ferland</strong>
                                            </div>
                                            <small class="text-muted">2 days ago</small>
                                        </div>
                                        <div>$244</div>

                                        <i class="material-icons icon-muted ml-3">arrow_forward</i>
                                    </div>
                                    <div class="card-footer text-center border-0">
                                        <a class="text-muted" href="">View All (54)</a>
                                    </div>
                                </div>
                                <div class="tab-pane" id="activity_purchases">

                                </div>
                                <div class="tab-pane" id="activity_emails">

                                </div>
                                <div class="tab-pane" id="activity_quotes"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- // END Header Layout Content -->
    </div>
    <!-- // END Header Layout -->

    <div class="mdk-drawer js-mdk-drawer" id="default-drawer" data-align="start">
        <div class="mdk-drawer__content">
            <div class="sidebar sidebar-light sidebar-left" data-perfect-scrollbar>
                <div class="sidebar-heading sidebar-m-t">Menu</div>
                <ul class="sidebar-menu">
                    <li class="sidebar-menu-item active">
                        <a class="sidebar-menu-button" href="#">
                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">view_compact</i>
                            <span class="sidebar-menu-text">Dashboard</span>
                        </a>
                    </li>

                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="#">
                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">business_center</i>
                            <span class="sidebar-menu-text">Project</span>
                        </a>
                    </li>

                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="#">
                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">people</i>
                            <span class="sidebar-menu-text">User</span>
                        </a>
                    </li>
                    <li class="sidebar-menu-item">
                        <a class="sidebar-menu-button" href="#">
                            <i class="sidebar-menu-icon sidebar-menu-icon--left material-icons">report</i>
                            <span class="sidebar-menu-text">Task</span>
                        </a>
                    </li>
                </ul>

                <div class="sidebar-p-a sidebar-b-y">
                    <div class="d-flex align-items-top mb-2">
                        <div class="sidebar-heading m-0 p-0 flex text-body js-text-body">
                            Progress
                        </div>
                        <div class="font-weight-bold text-success">60%</div>
                    </div>
                    <div class="progress">
                        <div class="progress-bar bg-success" role="progressbar" style="width: 60%" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
    <!-- App Settings FAB -->
    <div id="app-settings" hidden>
        <app-settings layout-active="fixed" :layout-location="{
      'default': 'index.html',
      'fixed': 'dashboard.html',
      'fluid': 'fluid-dashboard.html',
      'mini': 'mini-dashboard.html'}">
        </app-settings>
    </div>
    <!-- jQuery -->
    <script src="assets/vendor/jquery.min.js"></script>

    <!-- Bootstrap -->
    <script src="assets/vendor/popper.min.js"></script>
    <script src="assets/vendor/bootstrap.min.js"></script>

    <!-- Perfect Scrollbar -->
    <script src="assets/vendor/perfect-scrollbar.min.js"></script>

    <!-- DOM Factory -->
    <script src="assets/vendor/dom-factory.js"></script>

    <!-- MDK -->
    <script src="assets/vendor/material-design-kit.js"></script>

    <!-- App -->
    <script src="assets/js/toggle-check-all.js"></script>
    <script src="assets/js/check-selected-row.js"></script>
    <script src="assets/js/dropdown.js"></script>
    <script src="assets/js/sidebar-mini.js"></script>
    <script src="assets/js/app.js"></script>

    <!-- App Settings (safe to remove) -->
    <script src="assets/js/app-settings.js"></script>

    <!-- Flatpickr -->
    <script src="assets/vendor/flatpickr/flatpickr.min.js"></script>
    <script src="assets/js/flatpickr.js"></script>

    <!-- Global Settings -->
    <script src="assets/js/settings.js"></script>

    <!-- Chart.js -->
    <script src="assets/vendor/Chart.min.js"></script>

    <!-- App Charts JS -->
    <script src="assets/js/chartjs-rounded-bar.js"></script>
    <script src="assets/js/charts.js"></script>

    <!-- Chart Samples -->
    <script src="assets/js/page.dashboard.js"></script>
</body>

</html>