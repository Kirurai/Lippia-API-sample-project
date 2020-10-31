package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    ANALYSIS {
        @Override
        public Class<?> getEntityService() {
            return AnalysisService.class;
        }
    },
    BREEDS {
        @Override
        public Class<?> getEntityService() {
            return BreedsService.class;
        }
    },
    IMAGEID {
        @Override
        public Class<?> getEntityService() {
            return ImageIdService.class;
        }
    },
    CATEGORIES {
        @Override
        public Class<?> getEntityService() {
            return CategoriesService.class;
        }
    };

    public abstract Class<?> getEntityService();

}
