import {APP_INITIALIZER, Injector, NgModule} from "@angular/core";
import {ScrollingModule} from "@angular/cdk/scrolling";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {
  ApiModule as CirrasUnderwritingAPIServiceModule,
  Configuration as CirrasUnderwritingAPIServiceConfiguration
} from "@cirras/cirras-underwriting-api";
import {BrowserModule, Title} from "@angular/platform-browser";
import {ServiceWorkerModule} from "@angular/service-worker";
import {EffectsModule} from "@ngrx/effects";
import {StoreModule} from "@ngrx/store";
import {StoreDevtoolsModule} from "@ngrx/store-devtools";
import {StoreRouterConnectingModule} from "@ngrx/router-store";
import {AppConfigService, CoreUIModule, MapService, PublicApplicationHeaderModule, TokenService} from "@wf1/core-ui";
import {AppRoutingModule} from "./app-routing.module";
import {AppComponent} from "./containers/application-root/app.component";
import {environment} from "../environments/environment";
import {initialRootState, rootEffects, rootReducers} from "./store";
import {DATE_FORMATS, provideBootstrapEffects} from "./utils";
import {NgxMaskModule} from "ngx-mask";
import {MomentModule} from "ngx-moment";
import {UnauthorizedPageComponent} from "./components/unauthorized-page/unauthorized-page.component";
import {NgxTrimModule} from "ngx-trim";
import {ErrorPanelComponent} from "./components/common/error-panel/error-panel.component";
import {ConnectionServiceOptions, ConnectionServiceOptionsToken} from "ngx-connection-service";
import {DragDropModule} from "@angular/cdk/drag-drop";
import {RouteReuseStrategy} from "@angular/router";
import {CustomReuseStrategy} from "./utils/custom-route-reuse-strategy";
import {BaseWrapperComponent} from "./components/common/base-wrapper/base-wrapper.component";
import {HTTP_INTERCEPTORS, HttpClientModule, HttpHandler} from "@angular/common/http";
import {ResourcesInterceptor} from "./interceptors/resources-interceptor";
import {NgxPaginationModule} from "ngx-pagination";

import {CdkTableModule} from "@angular/cdk/table";
import {appInitFn} from "./utils/app-initializer";
import {AutoFocusDirective} from "./directives/auto-focus.directive";
import {BaseDialogComponent} from "./components/dialogs/base-dialog/base-dialog.component";
import {UpdateService} from "./services/update.service";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import {MatIconModule} from "@angular/material/icon";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatListModule} from "@angular/material/list";
import {MatInputModule} from "@angular/material/input";
import {MatSidenavModule} from "@angular/material/sidenav";
import {MatExpansionModule} from "@angular/material/expansion";
import {MatProgressSpinnerModule} from "@angular/material/progress-spinner";
import {MatRadioModule} from "@angular/material/radio";
import {MatSnackBarModule} from "@angular/material/snack-bar";
import {MatMenuModule} from "@angular/material/menu";
import {MatBadgeModule} from "@angular/material/badge";
import {MatGridListModule} from "@angular/material/grid-list";
import {MatSortModule} from "@angular/material/sort";
import {MatAutocompleteModule} from "@angular/material/autocomplete";
import {MatCheckboxModule} from "@angular/material/checkbox";
import {MatTableModule} from "@angular/material/table";
import {MatDialogModule} from "@angular/material/dialog";
import {MatCardModule} from "@angular/material/card";
import {MatTabsModule} from "@angular/material/tabs";
import {MatTooltipModule} from "@angular/material/tooltip";
import {MatButtonModule} from "@angular/material/button";
import {OWL_DATE_TIME_FORMATS, OwlDateTimeModule, OwlMomentDateTimeModule} from "@busacca/ng-pick-datetime";
import {BaseExpansionPanelComponent} from "./components/common/base-expansion-panel/base-expansion-panel.component";
import {WFSnackbarComponent} from "./components/common/snackbars/wf-snackbar.component";
import {TimeMaskDirective} from "./directives/time-mask.directive";
import {DateTimeMaskDirective} from "./directives/date-time-mask.directive";
import {DateMaskDirective} from "./directives/date-mask.directive";
import {ErrorDialogComponent} from "./components/dialogs/error-dialog/error-dialog.component";
import {DateRangeMaskDirective} from "./directives/date-range-mask.directive";
import {ReadonlyFieldDirective} from "./directives/readonly-field.directive";
import {ReadonlyFormDirective} from "./directives/readonly-form.directive";
import {A11yModule} from "@angular/cdk/a11y";

import {NgSelectModule} from "@ng-select/ng-select";
import {MultiSelectDirective} from "./directives/multi-select.directive";
import {SingleSelectDirective} from "./directives/singleselect.directive";

import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';

// import { UwContractsListContainerDesktop } from "./containers/uw-contracts-list/uw-contracts-list-container.component.desktop";
import { InventoryContractContainer } from "./containers/inventory/inventory-contract-container.component";
import { InventorySelectorComponent } from './components/inventory/inventory-selector/inventory-selector.component';
import { GrowerContractHeaderComponent } from './components/grower-contract-header/grower-contract-header.component';
import { UnderwritingCommentsComponent } from './components/underwriting-comments/underwriting-comments.component';
import { PrintoutLogoComponent } from './components/printout-logo/printout-logo.component';
import { AddLandComponent } from './components/inventory/add-land/add-land.component';
import { EditLandComponent } from './components/inventory/edit-land/edit-land.component';
import { GrainUnseededInventoryComponent } from './components/inventory/grain/grain-unseeded/grain-unseeded-inventory.component';
import { GrainSeededInventoryComponent } from "./components/inventory/grain/grain-seeded/grain-seeded-inventory.component";
import { UwContractsListContainer } from "./containers/uw-contracts-list/uw-contracts-list-container.component";
import { UwContractsListComponent } from "./components/uw-contracts-list/uw-contracts-list.component";
import { GrainDopComponent } from './components/dop/grain/grain-dop.component';
import { GrainDopContainer } from "./containers/dop/grain-dop-container.component";
import { ForageInventoryComponent } from "./components/inventory/forage/forage-inventory.component";
import { LandListContainer } from './containers/land-management/land-list-container.component';
import { LandListComponent } from './components/land-management/land-list/land-list.component';
import { ManageLandComponent } from './components/land-management/manage-land/manage-land.component';
import { ManageLandComponentContainer } from "./containers/land-management/manage-land-container.component";
import { RemoveFieldComponent } from './components/inventory/remove-field/remove-field.component';
import { LandingPageComponent } from './components/common/landingpage/landingpage.component';
import { LinkPlantingComponent } from './components/inventory/link-planting/link-planting.component';
import { RemovePlantingDialogComponent } from './components/inventory/link-planting/remove-planting-dialog/remove-planting-dialog.component';
import { DashboardComponent } from './components/maintain/dashboard/dashboard.component';
import { DashboardContainer } from "./containers/maintenance/dashboard-container.component";
import { SeedingDeadlinesComponent } from './components/maintain/seeding-deadlines/seeding-deadlines.component';
import { SeedingDeadlinesContainer } from "./containers/maintenance/seeding-deadlines-container.component";
import { GradeModifiersComponent } from './components/maintain/grade-modifiers/grade-modifiers.component';
import { GradeModifiersContainer } from "./containers/maintenance/grade-modifiers-container.component";
import { GradeModifiersTypesComponent } from './components/maintain/grade-modifiers/grade-modifiers-types/grade-modifiers-types.component';
import { GradeModifierTypesContainer } from "./containers/maintenance/grade-modifier-types-container.component";
import { ForageVarietyInsurabilityComponent } from './components/maintain/forage-variety-insurability/forage-variety-insurability.component';
import { ForageVarietyInsurabilityContainer } from "./containers/maintenance/forage-variety-insurability-container.component";
import { PlantInsurabilityComponent } from './components/maintain/forage-variety-insurability/plant-insurability/plant-insurability.component';
import { YieldConversionComponent } from './components/maintain/yield-conversion/yield-conversion.component';
import { YieldConversionContainer } from "./containers/maintenance/yield-conversion-container.component";
import { YieldConversionUnitsComponent } from './components/maintain/yield-conversion/yield-conversion-units/yield-conversion-units.component';
import { YieldConversionUnitsContainer } from "./containers/maintenance/yield-conversion-units-container.component";
import { WildfireApplicationModule } from "@wf1/wfcc-application-ui";
import { RelatedPoliciesComponent } from './components/related-policies/related-policies.component';
import { UnsavedDialogComponent } from './components/dialogs/unsaved-dialog/unsaved-dialog.component';
import { ForageDopComponent } from './components/dop/forage/forage-dop.component';
import { ForageDopContainer } from "./containers/dop/forage-dop-container.component";

import {MomentDateAdapter, MAT_MOMENT_DATE_ADAPTER_OPTIONS} from '@angular/material-moment-adapter';
import {DateAdapter, MAT_DATE_FORMATS, MAT_DATE_LOCALE} from '@angular/material/core';
import { MatInputCommifiedDirective } from "./directives/input-comified.directive";

/**
 * Function that initializes the Configuration injector with the application base url from the app config service.
 * Used by the Swagger CodeGen Rest API angular services.
 */
 export function cirrasUnderwritingRestInitializerFn(appConfig: AppConfigService) {
  const apiConfiguration = new CirrasUnderwritingAPIServiceConfiguration();
  apiConfiguration.basePath = appConfig.getConfig().rest["cirras_underwriting"];
  return apiConfiguration;
}

let devOnlyImports = [];

if (!environment.production || !environment.restrict_imports) {
    devOnlyImports = [
        StoreDevtoolsModule.instrument({
            maxAge: 50,
        }),
    ];
}

@NgModule({
    declarations: [
        DateMaskDirective,
        TimeMaskDirective,
        DateTimeMaskDirective,
        DateRangeMaskDirective,
        ReadonlyFieldDirective,
        ReadonlyFormDirective,
        MultiSelectDirective,
        SingleSelectDirective,
        MultiSelectDirective,
        SingleSelectDirective,

        MatInputCommifiedDirective,

        WFSnackbarComponent,
        BaseExpansionPanelComponent,
        BaseDialogComponent,
        AutoFocusDirective,

       // UwContractsListContainerDesktop,
        UwContractsListContainer,
        UwContractsListComponent,
        AppComponent,
        BaseWrapperComponent,

        UnauthorizedPageComponent,
        ErrorPanelComponent,
        ErrorDialogComponent,
        InventoryContractContainer,
        InventorySelectorComponent,
        GrowerContractHeaderComponent,
        UnderwritingCommentsComponent,
        PrintoutLogoComponent,
        AddLandComponent,
        EditLandComponent,
       GrainUnseededInventoryComponent,
       GrainSeededInventoryComponent,
       GrainDopComponent,
       GrainDopContainer,
       ForageInventoryComponent,
       LandListComponent,
       LandListContainer,
       ManageLandComponent,
       ManageLandComponentContainer,
       RemoveFieldComponent,
       LandingPageComponent,
       LinkPlantingComponent,
       RemovePlantingDialogComponent,
       DashboardComponent,
       DashboardContainer,
       SeedingDeadlinesComponent,
       SeedingDeadlinesContainer,
       GradeModifiersComponent,
       GradeModifiersContainer,
       GradeModifiersTypesComponent,
       GradeModifierTypesContainer,
       ForageVarietyInsurabilityComponent,
       ForageVarietyInsurabilityContainer,
       PlantInsurabilityComponent,
       YieldConversionComponent,
       YieldConversionContainer,
       YieldConversionUnitsComponent,
       YieldConversionUnitsContainer,
       RelatedPoliciesComponent,
       UnsavedDialogComponent,
       ForageDopComponent,
       ForageDopContainer
    ],
    imports: [
        CirrasUnderwritingAPIServiceModule,
        HttpClientModule,
        DragDropModule,
        CdkTableModule,
        BrowserModule,
        FormsModule,
        MatExpansionModule,
        MatBadgeModule,
        MatGridListModule,
        MatAutocompleteModule,
        MatButtonModule,
        MatCardModule,
        MatCheckboxModule,
        MatDialogModule,
        MatFormFieldModule,
        MatIconModule,
        MatInputModule,
        MatListModule,
        MatMenuModule,
        MatRadioModule,
        MatSelectModule,
        MatSnackBarModule,
        MatSortModule,
        MatTabsModule,
        MatTableModule,
        MatPaginatorModule,
        MatTooltipModule,
        MatSnackBarModule,
        MatSidenavModule,
        MatToolbarModule,
        MomentModule,
        MatProgressSpinnerModule,
        NgxTrimModule,
        NgxMaskModule.forRoot(),
        OwlDateTimeModule,
        OwlMomentDateTimeModule,
        ReactiveFormsModule,
        NgSelectModule,
        ScrollingModule,
        PublicApplicationHeaderModule,
        CoreUIModule.forRoot({configurationPath: environment.app_config_location}),
        StoreModule.forRoot(rootReducers, {initialState: initialRootState}),
        AppRoutingModule,
        NgxPaginationModule,
        // Connects RouterModule with StoreModule
        StoreRouterConnectingModule.forRoot(),
        EffectsModule.forRoot([]),
        ServiceWorkerModule.register("ngsw-worker.js", {enabled: environment.production, scope: "./"}),
        ...devOnlyImports,
        A11yModule,
        MatNativeDateModule,
        MatDatepickerModule,
        WildfireApplicationModule.forRoot(),
    ],
    providers: [
        // Added provideBootstrapEffects function to handle the ngrx issue that loads effects before APP_INITIALIZER
        // providers have finished initializing.
        // See https://github.com/ngrx/platform/issues/931 for more information.
        provideBootstrapEffects(rootEffects),
        UpdateService,
        AppConfigService,
        TokenService,
        MapService,
        Title,
        {
            provide: APP_INITIALIZER,
            useFactory: appInitFn,
            multi: true,
            deps: [HttpHandler, Injector]
        },
        {
          provide: CirrasUnderwritingAPIServiceConfiguration,
          useFactory: cirrasUnderwritingRestInitializerFn,
          multi: false,
          deps: [AppConfigService]
        },
        {provide: OWL_DATE_TIME_FORMATS, useValue: DATE_FORMATS},
        {provide: RouteReuseStrategy, useClass: CustomReuseStrategy},
        {
            provide: HTTP_INTERCEPTORS,
            useClass: ResourcesInterceptor,
            multi: true
        },
        {
          provide: ConnectionServiceOptionsToken,
          useValue: <ConnectionServiceOptions>{
              enableHeartbeat: false,
          }
        },
        { // sets the datepicker to display month with a 3 letter word
        provide: DateAdapter,
        useClass: MomentDateAdapter,
        deps: [MAT_DATE_LOCALE, MAT_MOMENT_DATE_ADAPTER_OPTIONS]
        },
    
        {provide: MAT_DATE_FORMATS, 
            useValue: {
                    parse: {
                    dateInput: 'LL',
                },
                    display: {
                    dateInput: 'MMM DD, YYYY',
                    monthYearLabel: 'MMM YYYY',
                    dateA11yLabel: 'LL',
                    monthYearA11yLabel: 'MMM YYYY',
                },
          } },

    ],
    entryComponents: [
        BaseDialogComponent,
        // ClaimsContainerMobile,
        // ClaimsComponentMobile,
        // CalculationsContainerMobile,
        // CalculationsComponentMobile,        
        ErrorDialogComponent,
    ],
    bootstrap: [AppComponent]
})
export class AppModule {

}
