package stegnography;

public interface Constants {
    String p = "photo.png";

    String PATH_ORIGIN = "original.png";

    String PATH_HIDDEN = "hidden.png";

    String PASSWORD = "qwerty";

    int HIDDEN_MESSAGE_BIT_LENGTH = 32;

    String MESSAGE = "Although we have described this algorithm for a single image I(m, n), any number of images can obviously be used (so long as the camera intrinsics and relative orientation to the\n" +
            "object are known for each image). The extra pixels from the other images are simply added in as additional constraints on the unknown coefficients ?i in Eq. (3). The algorithm can be used\n" +
            "to estimate a light-field from a collection of images. Once the light-field has been estimated, it can then be used to render new images of the same object under different poses. (See Vetter and\n" +
            "Poggio [48] for a related algorithm.)We have shown [21] that the algorithm correctly re-renders a given object assuming a Lambertian reflectance model. The extent to which these assumptions\n" +
            "are valid are illustrated in Figure 9.2, where we present the results of using our algorithm to re-render faces across pose. In each case the algorithm received the left-most (frontal) image\n" +
            "as input and created the rotated view in the middle. For comparison, the original rotated view is included as the right-most image. The re-rendered image for the first subject is similar to\n" +
            "the original. Although the image created for the second subject still shows a face in the correct pose, the identity of the subject is not as accurately recreated. We conclude that overall our\n" +
            "algorithm works fairly well but that more training data are needed so the eigen light-field of faces can more accurately represent any given face light-field.";
}
