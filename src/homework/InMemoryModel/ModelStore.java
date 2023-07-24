package homework.InMemoryModel;

import homework.ModelEliments.Camera;
import homework.ModelEliments.Flash;
import homework.ModelEliments.PoligonalModel;
import homework.ModelEliments.Scene;

import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangeObserver> changeObservers;

    public Scene getScene(int sceneNumber) {
        return new Scene();
    }

    public void notifyChange(IModelChanger change) {

    }
}
