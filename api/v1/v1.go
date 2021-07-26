package v1

import (
	_ "embed"
)

// Swagger is the embedded swagger definition.
//
//go:embed all.swagger.json
var Swagger []byte
