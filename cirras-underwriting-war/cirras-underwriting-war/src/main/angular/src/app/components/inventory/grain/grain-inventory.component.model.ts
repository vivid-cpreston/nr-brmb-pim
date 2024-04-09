import {DomSanitizer} from "@angular/platform-browser";
import {FormBuilder, FormArray} from "@angular/forms";
import {BaseComponentModel} from "../../common/base/base.component.model";
import {InventoryContract} from "../../../conversion/models";

export class GrainInventoryComponentModel extends BaseComponentModel {
    inventoryContract: InventoryContract

    constructor(protected sanitizer: DomSanitizer,
                private fb: FormBuilder,
                private inventoryContractData: InventoryContract) {

        super(sanitizer);
        this.inventoryContract = inventoryContractData;

        this.formGroup = this.fb.group({
            fertilizerInd: [''],  
            herbicideInd: [''],    
            tilliageInd: [''],
            otherChangesInd:[''],
            otherChangesComment:[''],           
            grainFromPrevYearInd: [''] ,
            showMoreColumns:    [false],
            fields: new FormArray([]),
            commodities: new FormArray([]),
        });
    }

    public clone(): GrainInventoryComponentModel {
        let clonedModel: GrainInventoryComponentModel = new GrainInventoryComponentModel(this.sanitizer, this.fb, this.inventoryContract);
        return clonedModel;
    }
}
