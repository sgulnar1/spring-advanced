package az.coders.spring.springadvanced;

import az.coders.spring.springadvanced.api.PetApiController;
import az.coders.spring.springadvanced.api.PetApiDelegate;
import az.coders.spring.springadvanced.model.ModelApiResponse;
import az.coders.spring.springadvanced.model.Pet;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PetController extends PetApiController {
    public PetController(PetApiDelegate delegate) {
        super(delegate);
    }

    @Override
    public PetApiDelegate getDelegate() {
        return super.getDelegate();
    }

    @Override
    public ResponseEntity<Pet> addPet(Pet pet) {
        return super.addPet(pet);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return super.deletePet(petId, apiKey);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(String status) {
        return super.findPetsByStatus(status);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        return super.findPetsByTags(tags);
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return super.getPetById(petId);
    }

    @Override
    public ResponseEntity<Pet> updatePet(Pet pet) {
        return super.updatePet(pet);
    }

    @Override
    public ResponseEntity<Pet> updatePetWithForm(Long petId, String name, String status) {
        return super.updatePetWithForm(petId, name, status);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, Resource body) {
        return super.uploadFile(petId, additionalMetadata, body);
    }
}
