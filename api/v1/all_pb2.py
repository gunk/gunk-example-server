# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: all.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='all.proto',
  package='v1',
  syntax='proto3',
  serialized_options=_b('\n\016example.api.v1H\001P\001Z-github.com/gunk/gunk-example-server/api/v1;v1\200\001\000\210\001\000\220\001\000\270\001\000\330\001\000\370\001\001\320\002\000'),
  serialized_pb=_b('\n\tall.proto\x12\x02v1\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\"Q\n\x07\x43ountry\x12\x1e\n\x04Name\x18\x01 \x01(\tB\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\x04name\x12\x1e\n\x04\x43ode\x18\x02 \x01(\tB\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\x04\x63ode:\x06\x08\x00\x10\x00\x18\x00\"G\n\x13GetCountriesRequest\x12(\n\tCountries\x18\x01 \x03(\tB\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\tcountries:\x06\x08\x00\x10\x00\x18\x00\"\xb0\x01\n\x14GetCountriesResponse\x12Q\n\tCountries\x18\x01 \x03(\x0b\x32\'.v1.GetCountriesResponse.CountriesEntryB\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\tcountries\x1a=\n\x0e\x43ountriesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x1a\n\x05value\x18\x02 \x01(\x0b\x32\x0b.v1.Country:\x02\x38\x01:\x06\x08\x00\x10\x00\x18\x00\"O\n\x07Message\x12\x1c\n\x03Msg\x18\x01 \x01(\tB\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\x03msg\x12\x1e\n\x04\x43ode\x18\x02 \x01(\x05\x42\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\x04\x63ode:\x06\x08\x00\x10\x00\x18\x00\"v\n\x13\x43heckStatusResponse\x12.\n\x06Status\x18\x01 \x01(\x0e\x32\n.v1.StatusB\n\x08\x00\x18\x00(\x00\x30\x00P\x00R\x06status\x12\'\n\x08OldField\x18\x02 \x01(\x05\x42\n\x08\x00\x18\x01(\x00\x30\x00P\x00R\told_field:\x06\x08\x00\x10\x00\x18\x00*8\n\x06Status\x12\x0f\n\x07Unknown\x10\x00\x1a\x02\x08\x00\x12\r\n\x05\x45rror\x10\x01\x1a\x02\x08\x00\x12\n\n\x02OK\x10\x02\x1a\x02\x08\x00\x1a\x02\x18\x00\x32\x94\x01\n\x10\x43ountriesService\x12{\n\x0cGetCountries\x12\x17.v1.GetCountriesRequest\x1a\x18.v1.GetCountriesResponse\"8\x88\x02\x00\x90\x02\x00\x82\xd3\xe4\x93\x02,Z\x1b\x12\x19/v1/countries/{Countries}\x12\r/v1/countries\x1a\x03\x88\x02\x00\x32\xb5\x01\n\x0bUtilService\x12X\n\x0b\x43heckStatus\x12\x16.google.protobuf.Empty\x1a\x17.v1.CheckStatusResponse\"\x18\x88\x02\x00\x90\x02\x00\x82\xd3\xe4\x93\x02\x0c\x12\n/v1/status\x12G\n\x04\x45\x63ho\x12\x0b.v1.Message\x1a\x0b.v1.Message\"%\x88\x02\x00\x90\x02\x00\x82\xd3\xe4\x93\x02\x19Z\r:\x01*\"\x08/v1/echo\x12\x08/v1/echo\x1a\x03\x88\x02\x00\x42X\n\x0e\x65xample.api.v1H\x01P\x01Z-github.com/gunk/gunk-example-server/api/v1;v1\x80\x01\x00\x88\x01\x00\x90\x01\x00\xb8\x01\x00\xd8\x01\x00\xf8\x01\x01\xd0\x02\x00\x62\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])

_STATUS = _descriptor.EnumDescriptor(
  name='Status',
  full_name='v1.Status',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='Unknown', index=0, number=0,
      serialized_options=_b('\010\000'),
      type=None),
    _descriptor.EnumValueDescriptor(
      name='Error', index=1, number=1,
      serialized_options=_b('\010\000'),
      type=None),
    _descriptor.EnumValueDescriptor(
      name='OK', index=2, number=2,
      serialized_options=_b('\010\000'),
      type=None),
  ],
  containing_type=None,
  serialized_options=_b('\030\000'),
  serialized_start=612,
  serialized_end=668,
)
_sym_db.RegisterEnumDescriptor(_STATUS)

Status = enum_type_wrapper.EnumTypeWrapper(_STATUS)
Unknown = 0
Error = 1
OK = 2



_COUNTRY = _descriptor.Descriptor(
  name='Country',
  full_name='v1.Country',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='Name', full_name='v1.Country.Name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='name', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='Code', full_name='v1.Country.Code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='code', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('\010\000\020\000\030\000'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=76,
  serialized_end=157,
)


_GETCOUNTRIESREQUEST = _descriptor.Descriptor(
  name='GetCountriesRequest',
  full_name='v1.GetCountriesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='Countries', full_name='v1.GetCountriesRequest.Countries', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='countries', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('\010\000\020\000\030\000'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=159,
  serialized_end=230,
)


_GETCOUNTRIESRESPONSE_COUNTRIESENTRY = _descriptor.Descriptor(
  name='CountriesEntry',
  full_name='v1.GetCountriesResponse.CountriesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='v1.GetCountriesResponse.CountriesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='v1.GetCountriesResponse.CountriesEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('8\001'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=340,
  serialized_end=401,
)

_GETCOUNTRIESRESPONSE = _descriptor.Descriptor(
  name='GetCountriesResponse',
  full_name='v1.GetCountriesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='Countries', full_name='v1.GetCountriesResponse.Countries', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='countries', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_GETCOUNTRIESRESPONSE_COUNTRIESENTRY, ],
  enum_types=[
  ],
  serialized_options=_b('\010\000\020\000\030\000'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=233,
  serialized_end=409,
)


_MESSAGE = _descriptor.Descriptor(
  name='Message',
  full_name='v1.Message',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='Msg', full_name='v1.Message.Msg', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='msg', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='Code', full_name='v1.Message.Code', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='code', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('\010\000\020\000\030\000'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=411,
  serialized_end=490,
)


_CHECKSTATUSRESPONSE = _descriptor.Descriptor(
  name='CheckStatusResponse',
  full_name='v1.CheckStatusResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='Status', full_name='v1.CheckStatusResponse.Status', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\000(\0000\000P\000'), json_name='status', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='OldField', full_name='v1.CheckStatusResponse.OldField', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\010\000\030\001(\0000\000P\000'), json_name='old_field', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('\010\000\020\000\030\000'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=492,
  serialized_end=610,
)

_GETCOUNTRIESRESPONSE_COUNTRIESENTRY.fields_by_name['value'].message_type = _COUNTRY
_GETCOUNTRIESRESPONSE_COUNTRIESENTRY.containing_type = _GETCOUNTRIESRESPONSE
_GETCOUNTRIESRESPONSE.fields_by_name['Countries'].message_type = _GETCOUNTRIESRESPONSE_COUNTRIESENTRY
_CHECKSTATUSRESPONSE.fields_by_name['Status'].enum_type = _STATUS
DESCRIPTOR.message_types_by_name['Country'] = _COUNTRY
DESCRIPTOR.message_types_by_name['GetCountriesRequest'] = _GETCOUNTRIESREQUEST
DESCRIPTOR.message_types_by_name['GetCountriesResponse'] = _GETCOUNTRIESRESPONSE
DESCRIPTOR.message_types_by_name['Message'] = _MESSAGE
DESCRIPTOR.message_types_by_name['CheckStatusResponse'] = _CHECKSTATUSRESPONSE
DESCRIPTOR.enum_types_by_name['Status'] = _STATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Country = _reflection.GeneratedProtocolMessageType('Country', (_message.Message,), {
  'DESCRIPTOR' : _COUNTRY,
  '__module__' : 'all_pb2'
  # @@protoc_insertion_point(class_scope:v1.Country)
  })
_sym_db.RegisterMessage(Country)

GetCountriesRequest = _reflection.GeneratedProtocolMessageType('GetCountriesRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCOUNTRIESREQUEST,
  '__module__' : 'all_pb2'
  # @@protoc_insertion_point(class_scope:v1.GetCountriesRequest)
  })
_sym_db.RegisterMessage(GetCountriesRequest)

GetCountriesResponse = _reflection.GeneratedProtocolMessageType('GetCountriesResponse', (_message.Message,), {

  'CountriesEntry' : _reflection.GeneratedProtocolMessageType('CountriesEntry', (_message.Message,), {
    'DESCRIPTOR' : _GETCOUNTRIESRESPONSE_COUNTRIESENTRY,
    '__module__' : 'all_pb2'
    # @@protoc_insertion_point(class_scope:v1.GetCountriesResponse.CountriesEntry)
    })
  ,
  'DESCRIPTOR' : _GETCOUNTRIESRESPONSE,
  '__module__' : 'all_pb2'
  # @@protoc_insertion_point(class_scope:v1.GetCountriesResponse)
  })
_sym_db.RegisterMessage(GetCountriesResponse)
_sym_db.RegisterMessage(GetCountriesResponse.CountriesEntry)

Message = _reflection.GeneratedProtocolMessageType('Message', (_message.Message,), {
  'DESCRIPTOR' : _MESSAGE,
  '__module__' : 'all_pb2'
  # @@protoc_insertion_point(class_scope:v1.Message)
  })
_sym_db.RegisterMessage(Message)

CheckStatusResponse = _reflection.GeneratedProtocolMessageType('CheckStatusResponse', (_message.Message,), {
  'DESCRIPTOR' : _CHECKSTATUSRESPONSE,
  '__module__' : 'all_pb2'
  # @@protoc_insertion_point(class_scope:v1.CheckStatusResponse)
  })
_sym_db.RegisterMessage(CheckStatusResponse)


DESCRIPTOR._options = None
_STATUS._options = None
_STATUS.values_by_name["Unknown"]._options = None
_STATUS.values_by_name["Error"]._options = None
_STATUS.values_by_name["OK"]._options = None
_COUNTRY.fields_by_name['Name']._options = None
_COUNTRY.fields_by_name['Code']._options = None
_COUNTRY._options = None
_GETCOUNTRIESREQUEST.fields_by_name['Countries']._options = None
_GETCOUNTRIESREQUEST._options = None
_GETCOUNTRIESRESPONSE_COUNTRIESENTRY._options = None
_GETCOUNTRIESRESPONSE.fields_by_name['Countries']._options = None
_GETCOUNTRIESRESPONSE._options = None
_MESSAGE.fields_by_name['Msg']._options = None
_MESSAGE.fields_by_name['Code']._options = None
_MESSAGE._options = None
_CHECKSTATUSRESPONSE.fields_by_name['Status']._options = None
_CHECKSTATUSRESPONSE.fields_by_name['OldField']._options = None
_CHECKSTATUSRESPONSE._options = None

_COUNTRIESSERVICE = _descriptor.ServiceDescriptor(
  name='CountriesService',
  full_name='v1.CountriesService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=_b('\210\002\000'),
  serialized_start=671,
  serialized_end=819,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCountries',
    full_name='v1.CountriesService.GetCountries',
    index=0,
    containing_service=None,
    input_type=_GETCOUNTRIESREQUEST,
    output_type=_GETCOUNTRIESRESPONSE,
    serialized_options=_b('\210\002\000\220\002\000\202\323\344\223\002,Z\033\022\031/v1/countries/{Countries}\022\r/v1/countries'),
  ),
])
_sym_db.RegisterServiceDescriptor(_COUNTRIESSERVICE)

DESCRIPTOR.services_by_name['CountriesService'] = _COUNTRIESSERVICE


_UTILSERVICE = _descriptor.ServiceDescriptor(
  name='UtilService',
  full_name='v1.UtilService',
  file=DESCRIPTOR,
  index=1,
  serialized_options=_b('\210\002\000'),
  serialized_start=822,
  serialized_end=1003,
  methods=[
  _descriptor.MethodDescriptor(
    name='CheckStatus',
    full_name='v1.UtilService.CheckStatus',
    index=0,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=_CHECKSTATUSRESPONSE,
    serialized_options=_b('\210\002\000\220\002\000\202\323\344\223\002\014\022\n/v1/status'),
  ),
  _descriptor.MethodDescriptor(
    name='Echo',
    full_name='v1.UtilService.Echo',
    index=1,
    containing_service=None,
    input_type=_MESSAGE,
    output_type=_MESSAGE,
    serialized_options=_b('\210\002\000\220\002\000\202\323\344\223\002\031Z\r:\001*\"\010/v1/echo\022\010/v1/echo'),
  ),
])
_sym_db.RegisterServiceDescriptor(_UTILSERVICE)

DESCRIPTOR.services_by_name['UtilService'] = _UTILSERVICE

# @@protoc_insertion_point(module_scope)
